package ru.yanborisov.netology.task2;

import java.io.*;

public class TryWithResource {

    public static void main(String[] args) {

    }

    /**
     * До появления try with resource
     */
    public void writeWithoutTryWithResource() {
        File file = new File("task21.txt");
        BufferedWriter buff = null;
        try {
            buff = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            buff.write("Hello World");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (buff != null) {
                    buff.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * С появлением try with resource
     */
    public void writeWithTryWithResource() {
        File file = new File("task21.txt");
        try (BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
            buff.write("Hello World");
            System.out.println("Файл записан.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
