package org.example;

public class Main {
    public static void main(String[] args) {
        ArrayProcessor processor = new ArrayProcessor();

        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "a", "7", "8"}, // "a" это не число
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = processor.processArray(validArray);
            System.out.println("Sum of valid array: " + sum);
        } catch (MyArraySizeException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Error: " + e.getMessage() + " at row " + e.getRow() + ", col " + e.getCol());
        }



        try {
            int sum = processor.processArray(invalidSizeArray);
            System.out.println("Sum of invalidSizeArray: " + sum);
        } catch (MyArraySizeException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Error: " + e.getMessage() + " at row " + e.getRow() + ", col " + e.getCol());
        }


        try {
            int sum = processor.processArray(invalidDataArray);
            System.out.println("Sum of invalidDataArray: " + sum);
        } catch (MyArraySizeException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Error: " + e.getMessage() + " at row " + e.getRow() + ", col " + e.getCol());
        }
    }
}