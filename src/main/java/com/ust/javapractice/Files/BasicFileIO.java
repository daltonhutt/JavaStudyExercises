package com.ust.javapractice.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicFileIO {
    public static void main(String[] args) {
//write to file
        File file = new File("test.txt");
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("Mike Fudge");
            output.println(42);
            output.close(); //closes to enable file to be accessed
        } catch (IOException ex) {
            System.out.printf("Error: %s\n", ex);
        }
//read from file
        try {
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            int age = input.nextInt();

            System.out.printf("Name: %d\n", name, age);
        } catch (FileNotFoundException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
    }
}
