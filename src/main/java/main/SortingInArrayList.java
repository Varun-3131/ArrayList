package main;

import java.util.ArrayList;
import java.util.Collections;

public class SortingInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(6);
        Collections.sort(list); //To sort an ArraList, we use a Function called-->"Collections.sort(ArrayList Name)".....
        System.out.println(list);

    }
}
