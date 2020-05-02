package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class OrganizingLottery {
    public static class ticket implements Comparable{

        long pt;
        char type;

        public ticket(long pt, char type) {
            this.pt = pt;
            this.type = type;
        }
        @Override
        public int compareTo(Object o) {
            long comparept=((ticket)o).pt;
            char comparetype=((ticket)o).type;
            /* For Ascending order*/
            if(this.pt==comparept)
            return this.type - comparetype;
            else
            return (int)(this.pt-comparept);
        }
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] start = new long[n];
        long[] end = new long[n];
        long[] points = new long[k];
        ArrayList<ticket> tickets = new ArrayList<ticket>();
        for(int x=0;x<n;x++)
        {
            tickets.add(new ticket(sc.nextLong(), 'l'));
            tickets.add(new ticket(sc.nextLong(), 'r'));
        }
        for(int x=0;x<k;x++)
        {
            points[x] = sc.nextLong();
            tickets.add(new ticket(points[x], 'p'));
        }
        Collections.sort(tickets);
        int count = 0;
        HashMap<Long, Integer> counts = new HashMap<>();
        for(ticket str: tickets){
            if(str.type=='l')
                count++;
            else if(str.type=='p')
                counts.put(str.pt, count);
            else
                count--;
           // System.out.println(str.pt+" "+str.type);
        }
        System.out.println(" ");
        for (long m : points)
        {
            System.out.print(counts.get(m)+" ");
        }
    }
}
