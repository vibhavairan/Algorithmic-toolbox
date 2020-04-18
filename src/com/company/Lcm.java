package com.company;

import java.util.Scanner;

public class Lcm {
    static long gcd(long a, long b)
    {
        if(b==0)
            return a;
        else
            return gcd(b , a%b);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println((a*b)/gcd(a,b));
    }
}
