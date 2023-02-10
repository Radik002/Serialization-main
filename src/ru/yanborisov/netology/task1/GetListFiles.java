package ru.yanborisov.netology.task1;

import java.io.File;
import java.util.Arrays;

public class GetListFiles {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Максим\\IdeaProjects\\serialization_deserialization_netology");
        String[] list = file.list();
        System.out.println(Arrays.toString(list));
    }
}
