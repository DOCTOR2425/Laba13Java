package org.example;

public class Main {
    public static void main(String[] args) {
        Tester t = new Tester("Egor", "Dudkin", 3000, 10, 3);
        System.out.println(t.toString());
        Tester.printInfo("Работает");
    }
}