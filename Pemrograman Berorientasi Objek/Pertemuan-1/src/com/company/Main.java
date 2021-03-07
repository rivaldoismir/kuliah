package com.company;

public class Main {

    public static void main(String[] args) {
        optionA();
        optionB();
        optionC();
        optionD();
    }
    private static void optionA() {
        int result = -5 + 8 * 6;
        System.out.println(result);
    }
    private static void optionB() {
        int result = (55+9) % 9;
        System.out.println(result);
    }
    private static void optionC() {
        int result = 20 + -3*5 / 8;
        System.out.println(result);
    }
    private static void optionD() {
        int result = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(result);
    }
}
