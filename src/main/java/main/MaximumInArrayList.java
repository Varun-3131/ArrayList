package main;

import java.util.ArrayList;

public class MaximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Declare a ArrayList...
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(0);
        list.add(2);

        //To check the Max Element...

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.print("Max Element=" + max);
    }
}
