package com.ust.javapractice.LambdaPractice;

import org.w3c.dom.css.CSSStyleDeclaration;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    int age;
    String emailAddress;
    Sex gender;

    public Person() {
    }

    public Person(String name, int age, String emailAddress, Sex gender) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

    public static List<Person>  generateDefaultList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Dalton", 20, "daltonthe@gmail.com", Sex.MALE));
        people.add(new Person("Daltona", 10, "daltonthehutt@gmail.com", Sex.FEMALE));
        people.add(new Person("Daltono", 30, "daltonhutt@gmail.com", Sex.MALE));
        return people;
    }

}
