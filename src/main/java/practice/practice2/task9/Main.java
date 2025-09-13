package practice.practice2.task9;

import java.io.File;

/**
 * Адаптер для работы с PDF и DOC (конвертация между форматами)
 * Описание
 * У нас есть два типа файлов:
 * PDF-файл, который должен обрабатываться системой, но она работает только с DOC.
 * Необходимо создать адаптер, который позволит работать с файлами обоих форматов, конвертируя их при необходимости.
 * Задача — создать интерфейс, который будет принимать файлы с расширением PDF или DOC,
 * а также адаптер, который будет конвертировать один формат в другой.
 */

public class Main {
    public static void main(String[] args) {
        File docFile = new File("example.doc");
        File pdfFile = new File("example.pdf");

        FileProcessor docProcessor = new DocProcessor();
        FileProcessor pdfProcessor = new FileAdapter();

        docProcessor.processFile(docFile);
        pdfProcessor.processFile(pdfFile);
    }
}
