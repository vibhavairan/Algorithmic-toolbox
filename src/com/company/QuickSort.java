package com.company;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    static int partition(long[] a, int l ,int r)
    {
        long x = a[l];
        int j = l, i=0;
        for(i=l+1;i<=r;i++)
        {
            if(a[i]<=x)
            {
                j++;
                if(i!=j) {
                    long temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        long temp = a[j];
        a[j] = a[l];
        a[l] = temp;
        return j;
    }
   /* static int[] partition(long[] a, int l ,int r)
    {
        long x = a[l];
        int j = l, i = 0,k = l;
        for(i=l+1;i<=r;i++) {
            if (a[i] < x) {
                j++;
                if (i != j) {
                    long temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    if (k != l) {
                        k++;
                        long temp1 = a[k];
                        a[k] = a[i];
                        a[i] = temp1;
                    }
                }
            } else if (a[i] == x) {
                if (k == l)
                    k = j + 1;
                else
                    k++;
                if(k!=i)
                {
                    long temp = a[k];
                    a[k] = a[i];
                    a[i] = temp; }
            }
        }
        long temp = a[j];
        a[j] = a[l];
        a[l] = temp;
        return new int[]{j,k};
    }*/
    static long[] quicksort(long[] a, int l, int r)
    {
        if(l>=r)
            return a;
        //Random rand = new Random();
        //int k = l + rand.nextInt(r-l+1);
        /*long temp = a[k];
        a[k] = a[l];
        a[l] = temp;*/
        //int[] m = partition(a,l,r);
        int m = partition(a,l,r);
        //quicksort(a,l,m[0]-1);
        //quicksort(a,m[1]+1,r);
        quicksort(a,l,m-1);
        quicksort(a,m+1,r);
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int x=0;x<n;x++)
            a[x] = sc.nextLong();
        a = quicksort(a,0,n-1);
        for(int x=0;x<n;x++)
            System.out.print(a[x]+" ");
    }
}
