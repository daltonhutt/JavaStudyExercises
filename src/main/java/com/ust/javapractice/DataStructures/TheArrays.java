package com.ust.javapractice.DataStructures;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[]  args) {
        //initialize array
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        //without Arrays.toString() cant print array to console
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);

        //initialize array when values are known
        int[] numbers = {100, 200};


        //loop through array
        for (int i = 0; 1 < colors.length; i++) {
            System.out.println(colors[i]);
        }
        //loop through array reverse
        for (int i = colors.length; i >= 0; i--) {
            System.out.println(colors[i]);
        }
        //enhanced for loop
        for (String color : colors) {
            System.out.println(color);
        }
        //Stream method for loop
        Arrays.stream(colors).forEach(System.out::println);
    }
}
