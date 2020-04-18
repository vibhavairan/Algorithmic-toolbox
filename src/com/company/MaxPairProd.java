package com.company;

import java.util.Scanner;

public class MaxPairProd {
    static long getMaxPairwiseProductFast(long[] numbers) {
        int nSize = numbers.length;

        int max_index1 = -1;
        for (int i = 0; i < nSize; i++) {
            if ((max_index1 == -1) || (numbers[i] > numbers[max_index1]))
                max_index1 = i;
        }

        int max_index2 = -1;
        for (int j = 0; j < nSize; j++) {
            if ((j != max_index1) && ((max_index2 == -1) || (numbers[j] > numbers[max_index2])))
                max_index2 = j;
        }

        return (long) numbers[max_index1] * numbers[max_index2];
    }

    // main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLong();
        }

        System.out.println(getMaxPairwiseProductFast(numbers));
    }
}