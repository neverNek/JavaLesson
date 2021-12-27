package com.geekbrains;

import java.util.Arrays;

public class HomeWorks {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 0, 0, 0 ,1, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println();


        int[] arrMax = new int[100];

        for (int i = 0; i < arrMax.length; i++) {
            arrMax[i] = i + 1;
        }

        System.out.println(Arrays.toString(arrMax));
        System.out.println();


        int[] arrMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arrMultiply.length; i++) {
            if (arrMultiply[i] < 6) {
                arrMultiply[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(arrMultiply));
        System.out.println();


        int[][] arrDim = new int[5][5];
        int a = 4;

        for (int i = 0; i < arrDim.length; i++) {
            arrDim[i][a] = 1;
            a--;
        }

        for (int i = 0; i < arrDim.length; i++) {
            arrDim[i][i] = 1;
        }

        for (int[] ints : arrDim) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();


        System.out.println(Arrays.toString(arrMethod(5,17)));


        int[] arrMinMax = {5, 4, 15, 6, 9};
        Arrays.sort(arrMinMax);
        System.out.println("Минимальное значение " + arrMinMax[0] + " Максимальное значение " + arrMinMax[arrMinMax.length - 1]);
        System.out.println();


        int[] arrTask7 = {2, 2, 2, 1, 2, 2, 10, 1};


    }

    public static int[] arrMethod(int len, int initialValue) {
        int[] arr = new int[len];

        Arrays.fill(arr, initialValue);

        return arr;
    }



}
