package me.whiteship.java8to11;

import java.util.function.Supplier;

public class SupplierClass {

    public static void main(String[] args) {
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10);
    }

}
