package com.company;

import java.util.Scanner;

public class MajorityElement {
    static  long majority(int start,int end,long[] a)
    {
        if(end-start==2)
        {
           if(a[start]==a[end]&&a[end]==a[start+1])
               return a[start];
           else if(a[start]==a[start+1])
               return a[start];
           else if(a[start+1]==a[end])
               return a[start+1];
           else if(a[start]==a[end])
               return a[start];
           else return 0;
           }
        if(end-start==1)
        {
            if(a[start]==a[end])
                return a[start];
            else return 0;
        }
        int middle = (int)Math.ceil((double)(start+end)/2);
        long left = majority(start, middle-1, a);
        long right = majority(middle, end, a);
        if(left!=right)
        {
            int countleft=0;
            int countright=0;
            for(int x=start; x<=end;x++) {
                if(a[x]==left)
                    countleft++;
                else if(a[x]==right)
                    countright++;
            }
            if(((end-start+1)/2)<countright)
                return right;
            else if(((end-start+1)/2)<countleft)
                return left;
            else
                return 0;
        }
        else return left;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int x=0;x<n;x++)
            a[x] = sc.nextLong();
        long major = majority(0,n-1,a);
        if(major!=0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
