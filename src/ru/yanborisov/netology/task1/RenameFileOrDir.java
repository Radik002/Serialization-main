package ru.yanborisov.netology.task1;

import java.io.File;

public class RenameFileOrDir {

    public static void main(String[] args) {
        File dir = new File("dir");
        if (dir.exists()) {
            File renameDir = new File("new-dir");
            if (dir.renameTo(renameDir)) {
                System.out.println("Папка переименована");
            }
        }
    }
}
