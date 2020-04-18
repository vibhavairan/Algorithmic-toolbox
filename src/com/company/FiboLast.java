package com.company;

import java.util.Scanner;

public class FiboLast {
    public static void main(String args[])
    {
        long a = 0, b=1, c=0;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n==0) {
            System.out.println("0");
        }
        else if(n==1) {
            System.out.println("1");
        }
        else
        {
            for(long x=0;x<n-1;x++)
            {
                c = (a+b)%10;
                a = b;
                b = c;
            }
                System.out.println(c);
        }
    }
}
