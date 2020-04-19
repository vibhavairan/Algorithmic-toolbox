package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class FiboSumLast {
    public static void main(String args[])
    {
        long a = 0, b=1, c=0;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n = n+2;
        /*if(n==0) {
            System.out.println("0");
        }
        else if(n==1) {
            System.out.println("1");
        }
        else*/
        /*{
            for(long x=0;x<n-1;x++)
            {
                c = (a+b)%10;
                a = b;
                b = c;
            }
            System.out.println(c-1);
        }*/
        double sq = Math.sqrt(5);
        BigDecimal k = BigDecimal.valueOf((Math.pow((1+sq)/2,n)-Math.pow((1-sq)/2,n))/sq);//binet formula
        System.out.println(k);
        System.out.println(k.toBigInteger());
       // k--;
        //System.out.println(k%10);

    }
}
