package com.company;

import java.util.Scanner;

public class Coins {

    public static void main(String args[])
    {
        long n=0,c5=0,c10=0,num=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        if (n > 9)
        {
            c10 = n / 10;
            n = n % 10;
        }
        if (n > 4)
        {
            c5 = n / 5;
            n = n % 5;
        }
        num = c10 + c5 + n;
        System.out.println(num);
    }
}
