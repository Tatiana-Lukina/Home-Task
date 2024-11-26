package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        printThreeWords();

        System.out.println("Задание 2");
        checkSumSign();

        System.out.println("Задание 3");
        printColor();

        System.out.println("Задание 4");
        compareNumbers();

        System.out.println("Задание 5");
        System.out.println(checkSum(5, 7));

        System.out.println("Задание 6");
        checkNumber(-4);

        System.out.println("Задание 7");
        checkNumber(-3);

        System.out.println("Задание 8");
        printString("I love QA", 5);

        System.out.println("Задание 9");
        System.out.println(checkYear(2012));

        System.out.println("Задание 10");
        changeArr();

        System.out.println("Задание 11");
        emptyArr();

        System.out.println("Задание 12");
        changeInArr();

        System.out.println("Задание 13");
        twoArr(10);

        System.out.println("Задание 14");
        createArr(10, 365);

    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -30;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 150;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSum(int a, int b){
        if ((a + b) >= 10 && (a + b) <= 20){
            return true;
        } else {
            return false;
        }
    }
        public static void checkNumber ( int number){
            if (number >= 0) {
                System.out.println("Положительное число");
            } else {
                System.out.println("Отрицательное число");
            }
        }

        public static boolean checkNumber2 ( int number){
            if (number >= 0) {
                return false;
            } else {
                return true;
            }
        }
    public static void printString (String str, int count) {
        for (int i = 0; i < count; i++){
            System.out.println(str);
        }
    }
    public static boolean checkYear(int a){
        if ((a % 4) != 0 | ((a / 100) % 4) != 0 ){
            return false;
        } else {
            return true;
        }
    }
    public static void changeArr(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void emptyArr(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = 1 + i;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void changeInArr(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void twoArr(int n){
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++){
            arr[i][i] = 1;
            arr[i][n - 1 -i] = 1;
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void createArr(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }


    }









