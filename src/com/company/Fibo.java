package com.company;

import java.util.Scanner;

public class Fibo {
    public static void main(String args[])
    {
        int a = 0, b=1, c=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0) {
            System.out.println("0");
        }
        else if(n==1) {
            System.out.println("1");
        }
        else
        {
            for(int x=0;x<n-1;x++)
        {
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);}
    }
}
