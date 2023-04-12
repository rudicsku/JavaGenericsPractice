package org.example;

import java.util.ArrayList;
import java.util.List;

//Generics to reduce code duplication
//Generics do not work with primitive types

public class Printer<T> {

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.print(thingToPrint);
    }


    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(23);
        integerPrinter.print();
        System.out.println();

        Printer<String> stringPrinter = new Printer<>("Hello");
        stringPrinter.print();
        System.out.println();

        Printer<Double> doublePrinter = new Printer<>(22.5);
        doublePrinter.print();
        System.out.println();

        //Collections work with generics
        List<String> stringList = new ArrayList<>();
        stringList.add("string");
    }
}
