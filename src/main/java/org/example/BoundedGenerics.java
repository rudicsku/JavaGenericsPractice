package org.example;


import java.io.Serializable;

//We can use interfaces as well, with the same extends keyword
public class BoundedGenerics<T extends Number & Serializable> {

    T thingToPrint;

    public BoundedGenerics(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.print(thingToPrint);
    }


    public static void main(String[] args) {
        BoundedGenerics<Integer> integerBoundedGenerics = new BoundedGenerics<>(12);
        integerBoundedGenerics.print();
        System.out.println();

        BoundedGenerics<Long> longBoundedGenerics = new BoundedGenerics<>(1L);
        longBoundedGenerics.print();
        System.out.println();

        //Bad example:
        //BoundedGenerics<String> stringBoundedGenerics = new BoundedGenerics<String>("this is not working");
    }

}
