package org.example;

public class GenericMethod {

    public static <T> void shout(T thingToShout) {
        System.out.println(thingToShout + "!!!!!");
    }

    public static <T, V> void shouts(T thingToShout1, V thingToShout2) {
        System.out.println(thingToShout1 + "!!!!!");
        System.out.println(thingToShout2 + "????");
    }

    public static void main(String[] args) {
        shout("Hello");
        shout(123);
        shout(12.34);

        shouts(1, "Hello");
    }
}
