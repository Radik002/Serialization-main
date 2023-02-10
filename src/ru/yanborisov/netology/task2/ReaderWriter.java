package ru.yanborisov.netology.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Чтение и запись символов
 */
public class ReaderWriter {

    public static void main(String[] args) throws IOException {
//        showOutputStreamWriter();
        showInputStreamReader();
    }

    private static void showOutputStreamWriter() throws IOException {
        File file = new File("task2.txt");
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(file));
        String data = "Hello World";
        out.write(data);
        out.close();
    }

    private static void showInputStreamReader() throws IOException {
        File file = new File("task2.txt");
        InputStreamReader in = new InputStreamReader(
                new FileInputStream(file),
                StandardCharsets.UTF_8
        );

        while (in.ready()) {
            char read = (char) in.read();
            System.out.print(read);
        }
        in.close();
    }
}
