package me.whiteship.java8to11;

public class ConsumerClass {

    public static void main(String[] args) {
        java.util.function.Consumer<Integer> printInteger = System.out::println;
        printInteger.accept(10);
    }

}
