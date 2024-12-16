package org.example;

public class ArrayProcessor {

    public int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        final int requiredSize = 4;


        // Проверка, имеет ли массив правильный размер (строки)

        // Check if the array has the correct size (rows)
        if (array.length != requiredSize) {
            throw new MyArraySizeException("Array must have 4 rows, but found " + array.length + " rows.");
        }


        // Проверка, имеет ли массив правильный размер (столбцы)

        // Check if the array has the correct size (columns)

        for (String[] row : array) {
            if (row.length != requiredSize) {
                throw new MyArraySizeException("Array must have 4 columns, but found " + row.length + " columns.");
            }
        }

        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                try {
                    sum += Integer.parseInt(array[row][col]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Invalid data at row: " + row + ", col: " + col, row, col);
                }
            }
        }
        return sum;
    }
}
