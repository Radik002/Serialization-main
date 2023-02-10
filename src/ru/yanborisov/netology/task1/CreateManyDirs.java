package ru.yanborisov.netology.task1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Создать вложенность папок. Вывести данную вложенность на экран.
 */
public class CreateManyDirs {

    public static void main(String[] args) throws IOException {
        String parentDirectoryName = "dir";
        String pathChildren = "dir1/dir2";
        File parentDirectory = new File(parentDirectoryName);
        if(parentDirectory.exists() && parentDirectory.isDirectory()) {
            createDirs(pathChildren, parentDirectory);
        } else {
            if(parentDirectory.mkdir()) {
                createDirs(pathChildren, parentDirectory);
            }
        }
    }

    private static void createDirs(String pathChildren, File parentDirectory) throws IOException {
        File childrenPaths = new File(parentDirectory, pathChildren);
        if(childrenPaths.mkdirs()) {
            System.out.println("Папки создались");
        }

        String absolutePath = childrenPaths.getAbsolutePath();

        System.out.println(absolutePath);
    }
}
