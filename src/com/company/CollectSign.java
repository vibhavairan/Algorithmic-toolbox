package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class CollectSign {
    private static class Segment implements Comparator{
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    };
    public static void main(String[] args)
    {
        ArrayList<Segment> lis = new ArrayList<>();
       // Collections.sort(lis);
    }
}
