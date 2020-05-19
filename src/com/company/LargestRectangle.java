package com.company;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle {
    static int rect(int h[])
    {
        int area = 0;
        int maxArea = 0;
        Stack st = new Stack();
        int x;
        for( x=0;x<h.length;)
        {
            if(st.isEmpty()||h[x]>=h[(int)st.peek()])
            {
                st.push(x);
                x++;
            } else
            {
                int top = (int)st.peek();
                st.pop();
                if(st.isEmpty()){
                    area = h[top] * x;
                }
                else {
                    area = h[top]*(x-(int)st.peek()-1);
                }
                if(area>maxArea){
                    maxArea = area;
                }
            }
        }
        while (!st.isEmpty())
        {
            int top = (int)st.peek();
            st.pop();
            if(st.isEmpty()){
                area = h[top] * x;
            }
            else{
                area = h[top] * (x - (int)st.peek() - 1);
            }
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int x=0;x<n;x++)
            arr[x] = sc.nextInt();
        System.out.println(rect(arr));
    }

}
