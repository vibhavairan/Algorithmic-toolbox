package com.company;
import java.math.BigInteger;
import java.util.Scanner;

public class FibSumLastPart {
    static long calculate_sum(int rem1, int rem2)
    {
        long a = 0, b = 1, c = 0, res=0;
        for(int x=0;x<=rem2;x++)
        {
            if(x>=rem1)
            {
                System.out.println(x+" : "+a);
                res = res+a;
            }
            c = (a+b)%10;
            a = b;
            b = c;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BigInteger n1 = sc.nextBigInteger();
        BigInteger n2 = sc.nextBigInteger();
        System.out.println(n1.mod(new BigInteger("60")));
        System.out.println(n2.mod(new BigInteger("60")));
        System.out.println((calculate_sum((n1.mod(new BigInteger("60"))).intValue(),n2.mod(new BigInteger("60")).intValue()))%10); //pisano period used
    }
}
