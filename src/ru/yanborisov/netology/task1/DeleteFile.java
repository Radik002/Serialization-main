package ru.yanborisov.netology.task1;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        File file = new File("new-dir/test.txt");
        if(file.exists()) {
            if(file.delete()) {
                System.out.println("Файл удален.");
            }
        }
    }
}
