package ru.yanborisov.netology.task1;

import java.io.File;
import java.io.IOException;


public class CreateFile {

    public static void main(String[] args) {
        File file = new File("dir/test.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            }
        } catch (IOException e) {
            System.out.println("Папка dir отсутствует.");
            throw new RuntimeException(e);
        }
    }
}
