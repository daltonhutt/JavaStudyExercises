package com.ust.javapractice.DateTime;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        //returns full date

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate sld = LocalDate.of(1976, 12, 23);
        System.out.println(sld);

    }


}
