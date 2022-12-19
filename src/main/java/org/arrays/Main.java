package org.arrays;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(2);
        numbers.insert(400);
        numbers.insert(20);
        numbers.insert(40);
        numbers.insert(30);
        numbers.insert(90);
//        numbers.removeAt(5);

        System.out.println(numbers.indexOf(90));
//        numbers.print();
    }
}