package ru.yanborisov.netology.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Упаковать архив.zip
 */
public class ZipArchiver {

    public static void main(String[] args) throws IOException {
        File fileZip = new File("test.zip");
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(fileZip));

        ZipEntry zipEntry1 = new ZipEntry("test_zip1.txt");
        ZipEntry zipEntry2 = new ZipEntry("test_zip2.txt");

        out.putNextEntry(zipEntry1);
        out.write("Привет Нетология!".getBytes(StandardCharsets.UTF_8)); // Записываем в файл №1
        out.closeEntry();

        out.putNextEntry(zipEntry2);
        out.write("Привет ученик!".getBytes(StandardCharsets.UTF_8)); // Записываем в файл №2
        out.closeEntry();

        out.close();
    }
}
