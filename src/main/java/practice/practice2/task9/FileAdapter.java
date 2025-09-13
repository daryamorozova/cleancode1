package practice.practice2.task9;

import java.io.File;

public class FileAdapter implements FileProcessor {

    private PdfProcessor pdfProcessor;

    public FileAdapter() {
        this.pdfProcessor = new PdfProcessor();
    }

    @Override
    public void processFile(File src) {
        if (src.getName().endsWith(".pdf")) {
            System.out.println("Конвертация фала в PDF " + src.getName());
        } else {
            System.out.println("Конвертация фала в DOC " + src.getName());
        }
    }
}
