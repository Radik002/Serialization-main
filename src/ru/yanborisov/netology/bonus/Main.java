package ru.yanborisov.netology.bonus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {
        Files.readAllLines(Path.of("bonus.txt"))
                .forEach(System.out::println);
    }
}
