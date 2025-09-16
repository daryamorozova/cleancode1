package practice.complexTasks.task3;

public class Book {
    private String title;
    private String author;
    private String description;
    private String content;

    public Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.description = builder.description;
        this.content = builder.content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public static class Builder {
        private String title;
        private String author;
        private String description;
        private String content;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}