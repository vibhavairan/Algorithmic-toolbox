package com.company;

import java.util.Scanner;

public class FracKnapsack {
    public static void main(String args[])
    {
        int n=0;
        long wei=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        wei = sc.nextLong();
        long[] v = new long[n];
        long[] w = new long[n];
        for(int i = 0; i<n;i++)
        {
            v[i] = sc.nextLong();
            w[i] = sc.nextLong();
        }
        double val = 0;
        double valfin = 0;
        int ind=0;
        if(n == 1)
        {
            if(wei<w[0])
                valfin = wei*((double)v[0]/w[0]);
            else
            valfin = v[0];
        }
        else
        for(int x = 0; x<n-1;x++)
        {
            val = (double) v[x]/w[x];
            ind = x;
            for(int y = x+1;y<n;y++)
            {
                if(val<(double) v[y]/w[y])
                {
                    val = (double) v[y]/w[y];
                    ind = y;
                }
            }
          //  System.out.println(v[ind]);
            if(ind!=x) {
                long temp = v[ind];
                v[ind] = v[x];
                v[x] = temp;
                temp = w[ind];
                w[ind] = w[x];
                w[x] = temp;
            }
            if(wei<w[x])
            {
                valfin = valfin + val*wei;
                //System.out.println(val*wei);
                break;
            }
            else {
                valfin = valfin + v[x];
                //System.out.println(v[x]);
                wei = wei - w[x];
                if(wei==0)
                    break;}
        }
       System.out.println(valfin);
    }
}
