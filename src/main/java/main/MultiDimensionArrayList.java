package main;

import java.util.ArrayList;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        //Declare Of Multi Dimensional ArrayList..
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); //Main List That will be printed
        ArrayList<Integer> list1 = new ArrayList<>(); //Row 1
        ArrayList<Integer> list2 = new ArrayList<>(); //Row 2
        ArrayList<Integer> list3 = new ArrayList<>(); //Row 3


        //Creating a 2D ArrayList...
        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);


        //To print ArrayList....
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println(" ");
        }
    }
}