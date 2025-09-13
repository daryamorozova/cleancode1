package practice.practice2.task9;

import java.io.File;

public class DocProcessor implements FileProcessor {
    @Override
    public void processFile(File src) {
        System.out.println("Обработка Doc файла " + src.getName());
    }
}
