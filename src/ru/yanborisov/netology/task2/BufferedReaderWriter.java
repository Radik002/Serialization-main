package ru.yanborisov.netology.task2;

import java.io.*;

/**
 * Буфферизированное чтение и запись символов.
 */
public class BufferedReaderWriter {

    public static void main(String[] args) throws IOException {
//        showBufferedWriter();
        showBufferedReader();
    }

    private static void showBufferedWriter() throws IOException {
        File file = new File("task21.txt");
        BufferedWriter buff = new BufferedWriter(new FileWriter(file));
//        BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        buff.write("Hello World");
        buff.close();
    }
    private static void showBufferedReader() throws IOException {
        File file = new File("task21.txt");
//        BufferedReader buff = new BufferedReader(new FileReader(file));
        BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        while (buff.ready()) {
            String s = buff.readLine();
            System.out.println(s);
        }
        buff.close();
    }
}
