package com.ust.javapractice.DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class theQueues {

    //FIFO
    //Deck of Cards
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 20));
        supermarket.add(new Person("Bob", 22));
        System.out.println(supermarket.peek());
        System.out.println(supermarket.size());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

     static record Person(String name, int age){}
}
