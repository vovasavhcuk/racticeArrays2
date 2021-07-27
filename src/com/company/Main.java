package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//	ex2();
//        ex4();
//        ex5();
        ex7();
    }

    public static void ex2() {
        final int ROWS = 3, COLS = 3;
        int sum = 0;
        int arr[][] = new int[ROWS][COLS];
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                arr[row][col] = (int) (Math.random() * 10) + 1;
            }
            sum += arr[row][row];
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(sum);
    }

    public static void ex4() {
        final int ROWS = 3, COLS = 3;
        int sum = 0, max = 0, ind = 0;
        int arr[][] = new int[ROWS][COLS];
        int arrSum[] = new int[ROWS];
        for (int row = 0; row < ROWS; row++) {
            sum = 0;
            for (int col = 0; col < COLS; col++) {
                arr[row][col] = (int) (Math.random() * 10) + 1;
                sum += Math.abs(arr[row][col]);
                arrSum[row] = sum;
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }
        for (int row = 0; row < ROWS; row++) {
            if (arrSum[row] > max) {
                max = arrSum[row];
                ind = row;
            }
        }
        System.out.println("Номер строки с максимальной суммой: " + (ind + 1) + ", сумма " + max);
    }

    public static void ex5() {
        final int ROWS = 5, COLS = 5;
        int max = 0, count = 0;
        int arr[][] = new int[ROWS][COLS];
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                arr[row][col] = (int) (Math.random() * 10) + 1;
                System.out.print(arr[row][col] + "\t");
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
            System.out.println();
        }
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (arr[row][col] == max) {
                    count++;
                }
            }
        }
        System.out.println("Максимальны  элемент массива: " + max + ", встречается он " + count + " раз");
    }

    public static void ex7() {
        final int ROWS = 4, COLS = 4;
        int tmp;
        int arr[][] = new int[ROWS][COLS];
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                arr[row][col] = (int) (Math.random() * 9) + 1;
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println("==================");
        for (int i = 0; i < COLS; i += 2) {
            for(int j = 0; j < ROWS; j++){
            tmp = arr[i][j];
            arr[i][j] = arr[i+1][j];
            arr[i+1][j] = tmp;
            }

        }
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
