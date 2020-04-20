package com.company;

import java.util.Scanner;

public class CarFueling {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long d = sc.nextLong();
        long m = sc.nextLong();
        int n = sc.nextInt();
        long st[] = new long[n+2];
        for (int x=1;x<n+1;x++)
            st[x] = sc.nextLong();
        st[0] = 0;
        st[n+1] = d;
        int count=0, cur=0, last=0;
        while (cur<=n)
        {
            last = cur;
            while (cur<=n&&(st[cur+1]-st[last]<=m))
                cur =cur+1;
            if(last==cur)
            {System.out.println(-1);return;}
            if (cur<=n)
             count++;
        }
        System.out.println(count);
    }
}
