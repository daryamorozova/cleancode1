package theory.practice2.structural.proxy.after;

public class ImageProxy implements Showable {
    private HighResolutionImage image;
    private String imageFilePath;

    // при создании прокси изображения мы не загружаем само изображение
    public ImageProxy(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    // ленивая загрузка - только в момент явного вызова метода show
    @Override
    public void show() {
        // произвести загрузку изображения только 1 раз
        if (this.image == null) {
            this.image = new HighResolutionImage(imageFilePath);
        }
        image.showImage();
    }
}
