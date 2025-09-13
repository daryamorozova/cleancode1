package theory.practice2.structural.proxy.before;

public class Main {
    public static void main(String[] args) {
        // в момент создания изображения происходит загрузка файла
        HighResolutionImage image = new HighResolutionImage("path/to/high/res/image");

        // отображения изображение
        image.showImage();
    }
}
