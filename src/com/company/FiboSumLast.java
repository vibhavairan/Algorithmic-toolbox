package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

public class FiboSumLast {
    static long calculate_sum(int rem)
    {
        long a = 0, b = 1, c = 0, res=0;
        for(int x=0;x<=rem;x++)
        {
            res = res+a;
            c = (a+b)%10;
            a = b;
            b = c;
        }
        return res;
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       BigInteger n = sc.nextBigInteger();
       System.out.println((calculate_sum((n.mod(new BigInteger("60"))).intValue()))%10); //pisano period used
    }
}
