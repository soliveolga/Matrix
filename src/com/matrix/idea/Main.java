package com.matrix.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Количество строк: ");
        int size1 = input.nextInt();
        System.out.println("Количество столбцов: ");
        int size2 = input.nextInt();

        int[][] matrix = new int[size1][size2];
        System.out.println("Данные для массива: ");



        for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("вывод первой строки матрицы на экран, где каждый элемент умножается на 3");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] =  matrix[i][j] * 3;
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
