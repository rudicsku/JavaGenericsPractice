package org.example;

import java.util.List;

public class WildCards {

    public static void printList(List<?> myList) {
        System.out.println(myList);
    }

    public static void printListBounded(List<? extends Number> myList) {
        System.out.println(myList);
    }


    public static void main(String[] args) {
        List<Integer> myList1 = List.of(1, 2, 3, 4, 5);
        List<String> myList2 = List.of("1", "2", "3");
        List<Double> myList3 = List.of(1.1, 2.2, 3.3);

        printList(myList1);
        printList(myList2);
        printList(myList3);

        printListBounded(myList1);
        //printListBounded(myList2);
        printListBounded(myList3);
    }

}
