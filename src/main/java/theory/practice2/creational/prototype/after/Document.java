package theory.practice2.creational.prototype.after;

class Document implements Clonable{
    String text;
    String[] images;

    public Document(String text, String[] images) {
        this.text = text;
        this.images = images;
    }

    @Override
    public Document clone() {
        // глубокое копирование
        String[] imagesCopy = new String[this.images.length];
        System.arraycopy(this.images, 0, imagesCopy, 0, this.images.length);
        return new Document(this.text, imagesCopy);
    }
}
