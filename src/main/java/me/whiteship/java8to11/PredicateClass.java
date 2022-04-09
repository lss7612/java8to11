package me.whiteship.java8to11;

import java.util.function.Predicate;

public class PredicateClass {

    public static void main(String[] args) {
        Predicate<String> startsWithSangsung = s -> s.startsWith("sangsung");
        Predicate<Integer> isEven = i -> i % 2 == 0;
    }

}
