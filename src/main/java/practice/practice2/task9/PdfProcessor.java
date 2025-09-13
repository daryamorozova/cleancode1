package practice.practice2.task9;

import java.io.File;

public class PdfProcessor implements FileProcessor {
    @Override
    public void processFile(File src) {
        System.out.println("Обработка PDF файла " + src.getName());
    }
}
