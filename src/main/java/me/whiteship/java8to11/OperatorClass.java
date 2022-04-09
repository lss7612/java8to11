package me.whiteship.java8to11;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorClass {

    public static void main(String[] args) {
        UnaryOperator<Integer> plus10 = i -> i + 10;
        BinaryOperator<Integer> binaryOperator = (i, j) -> i + j + 3;
        System.out.println(binaryOperator.apply(2,3));
        System.out.println(plus10.apply(10));
    }
}
