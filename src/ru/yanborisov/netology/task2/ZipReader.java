package ru.yanborisov.netology.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Распаковать архив.zip
 */
public class ZipReader {

    public static void main(String[] args) throws IOException {
        File file = new File("test.zip");
        ZipInputStream zinIn = new ZipInputStream(new FileInputStream(file));
        ZipEntry entry;
        while ((entry = zinIn.getNextEntry()) != null) {
            FileOutputStream out = new FileOutputStream(entry.getName());

            while (true) {
                int read = zinIn.read();
                if(read == -1) {
                    break;
                }
                out.write(read);
            }

            out.close();
            zinIn.closeEntry();
        }
        zinIn.close();
    }
}
