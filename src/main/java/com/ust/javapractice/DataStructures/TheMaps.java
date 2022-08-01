package com.ust.javapractice.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Alexis"));
        map.put(3, new Person("Alexis 2")); //make sure keys are not matching it will only overwrite the value, not make another
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1)); //returns alex
        System.out.println(map.containsKey(3)); // returns aleisx 2
        System.out.println(map.keySet()); //reutrns list of numbers
        System.out.println(map.entrySet());
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue())); //loop through hashmap and get ket and value printed
        map.forEach((integer, person) -> {
            System.out.println(integer + " - " + person); // another loop method
        });
        map.clear(); //clears map
    }

    record Person(String name){}
}
