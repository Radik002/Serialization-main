package ru.yanborisov.netology.task1;

import java.io.File;

/**
 * Создать каталог dir (Вывести абсолютный путь данной папки).
 */
public class CreateDir {
    public static void main(String[] args) {
        String dirName = "dir";
        File dir = new File(dirName);
        if(dir.mkdir()) {
            System.out.printf("Папка %s создана\n", dirName);
        }
        String absolutePath = dir.getAbsolutePath();
        System.out.println(absolutePath);
    }
}
