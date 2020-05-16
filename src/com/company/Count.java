package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Count {
    static int countt(int a[], int n)
    {
        HashMap<Integer, Integer> count = new HashMap<>();
        int m = 0;
        for(int x=0;x<n;x++)
        {
            if(count.containsKey(a[x]))
            {  m = count.get(a[x]);
                count.put(a[x],m+1);}
            else
                count.put(a[x],1);
        }
        int max=-1, minkey=-1;
        for (Integer x: count.keySet())
        {
            if(count.get(x)>max)
            {
                max = count.get(x);
                minkey = x;
            }
            else if(count.get(x)==max&&minkey>x)
            {
                minkey = x;
            }
        }
        return minkey;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int x=0;x<n;x++)
        {
            a[x] = sc.nextInt();
        }
        System.out.println(countt(a, n));
    }
}
