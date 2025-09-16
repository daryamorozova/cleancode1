package practice.complexTasks.task3;

class BookProxy {
    private Book book;
    private boolean isContentLoaded = false;

    public BookProxy(Book book) {
        this.book = book;
    }

    public String getContentMethod() {
        if (!isContentLoaded) {
            book.setContent("Loaded content of the book...");
            isContentLoaded = true;
        }
        return book.getContent();
    }
}