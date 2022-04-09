package me.whiteship.java8to11;

import java.util.function.Function;

public class FunctionClass {

    public static void main(String[] args) {
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));

        Function<Integer,Integer> plus9 = i -> i + 9;
        System.out.println(plus9.apply(1));
        Function<Integer,Integer> multiply2 = i -> i * 2;
        System.out.println(multiply2.apply(2));

        Function<Integer, Integer> multiply2AndPlus9 = plus9.compose(multiply2);
        System.out.println(multiply2AndPlus9.apply(3));

        Function<Integer, Integer> plush9AndPlus9 = plus9.andThen(plus9);
        System.out.println(plush9AndPlus9.apply(1));


    }

}
