package com.ust.javapractice.Optionals;

import java.util.Optional;

public class OptionalsMain {
    public static void main(String[] args) {;
        Optional<String> hello = Optional.of("hello");

        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());

        String orElse = hello
                .map(String::toUpperCase)
                .orElseGet(() -> {

                };

        System.out.println(orElse);
    }


}
