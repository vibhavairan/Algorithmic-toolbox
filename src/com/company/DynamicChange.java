package com.company;

import java.util.Scanner;

public class DynamicChange {
    static int DPchange(int money, int[] coins)
    {

        int[] MinNumCoins = new int[money+1];
        MinNumCoins[0] = 0;
        int numCoins=0;
        for (int x=1;x<=money;x++)
        {
            MinNumCoins[x] = Integer.MAX_VALUE;
            for (int y=0;y<coins.length;y++)
            {
                if(x>=coins[y])
                {
                    numCoins = MinNumCoins[x-coins[y]]+1;
                    if(numCoins<MinNumCoins[x])
                        MinNumCoins[x] = numCoins;

                }
            }
        }
        return MinNumCoins[money];
    }
    public static void main(String[] args)
    {
        int[] coins = {1, 3, 4};
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println(DPchange(money,coins));
    }
}
