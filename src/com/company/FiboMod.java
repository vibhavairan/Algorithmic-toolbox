package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class FiboMod {
    static long get_pisano_period(long m)
    {
        long a = 0, b = 1, c = 0;
        for(long x=0;x<m*m;x++)
        {
            c = (a+b)%m;
            a = b;
            b = c;
            if(a==0&&b==1)
                return x+1;
        }
        return -1;
    }
    static long fib(long n, long m)
    {
        long remainder = n%get_pisano_period(m);
        //System.out.println(get_pianso_period(m));
        BigInteger a= new BigInteger("0");
        BigInteger b= new BigInteger("1");
        BigInteger c= new BigInteger("0");

        if(remainder==0) {
            return 0;
        }
        else if(remainder==1) {
            return 1;
        }
        else
        {
            for(long x=0;x<remainder-1;x++)
            {
                c = a.add(b);
                a = b;
                b = c;
            }
            return ((c.mod(BigInteger.valueOf(m))).longValue());}
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        System.out.println(fib(n,m));
    }
}
