package com.ust.javapractice.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        //alt method to make list but immutable
        List<String> colorsUnmodifiable = List.of(
                "blue",
                "yellow"
        );
        List<String>colors =  new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors);
        }

        for (String color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);
    }
}
