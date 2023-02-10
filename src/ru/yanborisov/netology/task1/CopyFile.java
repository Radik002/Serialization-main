package ru.yanborisov.netology.task1;

import java.io.*;
import java.nio.file.Files;

public class CopyFile {

    public static void main(String[] args) throws IOException {
        File sourceFile = new File("test.txt");
        File destDir = new File("dest.txt");
        createFiles(sourceFile, destDir);

        if(sourceFile.exists()) {
            System.out.println(sourceFile.toPath());
            System.out.println(destDir.toPath());
            Files.copy(sourceFile.toPath(), destDir.toPath());
            System.out.println("Файл скопирован");
        }
    }

    private static boolean createFiles(File sourceFile, File destDir) throws IOException {
        FileWriter fileWriter = new FileWriter(sourceFile);
        fileWriter.write("123");
        fileWriter.close();
        return sourceFile.createNewFile() && destDir.createNewFile();
    }
}
