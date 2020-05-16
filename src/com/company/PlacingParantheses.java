package com.company;

import java.util.Scanner;

public class PlacingParantheses {
    static long eval(long a, long b, char op) {
        if (op == '*') {
            return a * b;
        } else if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else {
            return -1;
        }
    }

    static long get_maximum_value(String exp) {
        int length = exp.length();
        int numOfnum = (length + 1) / 2;
        long minArray[][] = new long[numOfnum][numOfnum];
        long maxArray[][] = new long[numOfnum][numOfnum];

        for (int i = 0; i < numOfnum; i++)
        {
            maxArray[i][i] = minArray[i][i] = Integer.parseInt(exp.charAt(2*i)+"");
        }
        for (int i=0;i<numOfnum;i++)
        {
            for (int j=0;j<numOfnum;j++)
            {
                System.out.print(minArray[i][j]+" ");
            }
            System.out.println(" ");
        }
        for (int i=0;i<numOfnum;i++)
        {
            for (int j=0;j<numOfnum;j++)
            {
                System.out.print(maxArray[i][j]+" ");
            }
            System.out.println(" ");
        }
        for (int s = 0; s < numOfnum - 1; s++)
        {
            for (int i = 0; i < numOfnum - s - 1; i++)
            {
                int j = i + s + 1;
                long minVal = Long.MAX_VALUE;
                long maxVal = Long.MIN_VALUE;
                // find the minimum and maximum values for the expression
                // between the ith number and jth number
                for (int k = i; k < j; k++ )
                {
                    long a = eval(minArray[i][k],minArray[k + 1][j],exp.charAt(2 * k + 1));
                    long b = eval(minArray[i][k],maxArray[k + 1][j],exp.charAt(2 * k + 1));
                    long c = eval(maxArray[i][k],minArray[k + 1][j],exp.charAt(2 * k + 1));
                    long d = eval(maxArray[i][k],maxArray[k + 1][j],exp.charAt(2 * k + 1));
                    minVal = Math.min(minVal,Math.min(a,Math.min(b,Math.min(c,d))));
                    maxVal = Math.max(maxVal,Math.max(a,Math.max(b,Math.max(c,d))));
                }
                minArray[i][j] = minVal;
                maxArray[i][j] = maxVal;
            }
        }

        return maxArray[0][numOfnum - 1];
    }

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println(get_maximum_value(s));
    }
}
