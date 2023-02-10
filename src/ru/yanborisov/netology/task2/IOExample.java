package ru.yanborisov.netology.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Чтение и запись байтов.
 */
public class IOExample {

    public static void main(String[] args) throws IOException {
        showInputStream();
//        showOutputStream();
    }

    private static void showOutputStream() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = ("Hello World").getBytes(StandardCharsets.UTF_8);
        out.write(buffer);
        System.out.println(out);
        out.close();
    }

    private static void showInputStream() throws IOException {
        InputStream in = new ByteArrayInputStream("Hello world".getBytes(StandardCharsets.UTF_8));
        while (true) {
            int currentByte = in.read();
            System.out.println(currentByte);
            if(currentByte == -1) {
                break;
            }
        }
    }
}
