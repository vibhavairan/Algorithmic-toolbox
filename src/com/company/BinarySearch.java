package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static long binary(long[] a, long m, int start, int last)
    {
        int middle = (int) Math.floor((double) (start+last)/2);
        if(start>last)
            return -1;
        else if(m==a[middle])
            return middle;
        else if(m>a[middle])
            return binary(a,m,middle+1,last);
        else
            return binary(a,m,start,middle-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int x=0; x<n;x++)
        {
           a[x] = sc.nextLong();
        }
        int k = sc.nextInt();
        long[] b = new long[n];
        for(int x=0; x<k;x++)
        {
            b[x] = sc.nextLong();
        }
        Arrays.sort(a);
        for(int x = 0 ; x<k ; x++)
            b[x] = binary(a,b[x],0,n-1);
       // System.out.println(" ");
        for(int x=0;x<k;x++)
            System.out.print(b[x]+" ");
    }
}
