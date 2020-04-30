package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxPrize {
    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        int x=0;
        while (n!=0)
        {
            x++;
            if (n>=x)
            {
                summands.add(x);
                n=n-x;
            }
            else
            {
                summands.set(summands.size()-1,(summands.get(summands.size()-1)+n));
                n=0;
            }
        }
        return summands;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}
