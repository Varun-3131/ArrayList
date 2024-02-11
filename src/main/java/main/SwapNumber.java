package main;

import java.util.ArrayList;

public class SwapNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original list:-" + list);

        int idx1 = 1, idx2 = 3; //Enter the index you want to swap...

        //To Swap the Element-->
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        System.out.print("After Swapping=" + list);
    }
}
