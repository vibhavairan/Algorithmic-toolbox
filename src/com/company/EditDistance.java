package com.company;
import java.util.Scanner;

public class EditDistance {
    static int findSmallest(int num1,int num2, int num3){
        if(num1<=num2 && num1<=num3)
            return num1;
        else if(num2<=num1 && num2<=num3)
            return num2;
        else
            return num3;
    }
    static int DpDistance(String s1,String s2)
    {
        int[][] d = new int[s1.length()+1][s2.length()+1];
        int insertion = 0, deletion = 0, match = 0, mismatch = 0;
        int n = Math.max(s1.length(),s2.length());
        for(int x = 0; x<=n;x++)
        {
            if(x<=s1.length())
                d[x][0] = x;
            if(x<=s2.length())
                d[0][x] = x;
        }
        for(int j=1; j<=s2.length();j++)
        {
            for(int i=1; i<=s1.length();i++)
            {
                insertion = d[i][j-1]+1;
                deletion = d[i-1][j]+1;
                match = d[i-1][j-1];
                mismatch = d[i-1][j-1]+1;
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    d[i][j] = findSmallest(insertion,deletion,match);
                else
                    d[i][j] = findSmallest(insertion,deletion,mismatch);
            }
        }
       //System.out.println("------------");
       /* for(int i=0; i<=s1.length();i++)
        {
            for(int j=0; j<=s2.length();j++)
                System.out.print(d[i][j]+" ");
            System.out.println(" ");
        }*/
        //System.out.println("COST "+d[s1.length()][s2.length()]);
        return d[s1.length()][s2.length()];
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(DpDistance(s1,s2));
    }
}
