package com.ust.javapractice.DataStructures;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
//order not guaranteed No duplicates
public class TheSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>(); //use TreeSet if you care about order
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue")); //this is a duplicate
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.remove(new Ball("red"));
        System.out.println(balls.size()); // returns 3 because ignores duplicates

        balls.forEach(System.out::println);
    }

    static class Ball {
        String color;        // returns 4
                                // now must override equals and hashcode and toString
                                // now returns 3 again
        public Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return color.equals(ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
