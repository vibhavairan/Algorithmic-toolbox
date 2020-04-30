package com.company;

import java.util.Scanner;

public class OrganizingLottery {
    static long Lottery(long[] start, long[] end, int f, int l, long num)
    {
        if(f==l)
        {
            if(start[f]<=num&&num<=end[f])
            return 1;
            else
                return 0;
        }
        int middle = (int)Math.ceil((double)(f+l)/2);
        return (Lottery(start,end,f,middle-1, num) + Lottery(start,end,middle,l, num));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] start = new long[n];
        long[] end = new long[n];
        long[] points = new long[k];
        for(int x=0;x<n;x++)
        {
            start[x] = sc.nextLong();
            end[x] = sc.nextLong();
        }
        for(int x=0;x<k;x++)
        {
            points[x] = sc.nextLong();
        }
        for(int x=0;x<k;x++)
        {
            points[x] = Lottery(start,end,0,n-1, points[x]);
        }
        System.out.println(" ");
        for (int x=0;x<k;x++)
        System.out.print(points[x]+" ");
    }
}
