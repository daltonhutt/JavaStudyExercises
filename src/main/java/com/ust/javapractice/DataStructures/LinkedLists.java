package com.ust.javapractice.DataStructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<theQueues.Person> linkedList = new LinkedList<>();
        linkedList.add(new theQueues.Person("Alex", 21) );
        linkedList.add(new theQueues.Person("Alexa", 20) );
        linkedList.addFirst(new theQueues.Person("Ali", 19));
        ListIterator<theQueues.Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }
}
