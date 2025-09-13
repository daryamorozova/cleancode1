package theory.practice2.creational.prototype.before;

class Document {
    String text;
    String[] images;

    public Document(String text, String[] images) {
        this.text = text;
        this.images = images;  // Поверхностное копирование ссылки на массив
    }

    public Document clone() {
        // поверхностное копирование изображения приводит к тому, что
        // при изменении копии меняется оригинал
        return new Document(this.text, this.images); // Проблемы с глубоким копированием
    }
}
