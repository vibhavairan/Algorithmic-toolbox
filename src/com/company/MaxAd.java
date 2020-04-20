package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaxAd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        long b[] = new long[n];
        for(int x=0;x<n;x++)
        {
           a[x] = sc.nextLong();
        }
        for(int x=0;x<n;x++)
        {
            b[x] = sc.nextLong();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        long pro = 0;
        for (int x=0;x<n;x++)
        {
            pro += a[x]*b[x];
        }

       System.out.println(pro);
    }
}
