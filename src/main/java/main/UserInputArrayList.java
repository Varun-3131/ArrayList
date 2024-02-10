package main;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        System.out.print("Enter the no. of Element:-");
        int n = sc.nextInt();
        System.out.println("Enter the elemnts:-");
        for (int i = 0; i <= n; i++) {
            i = sc.nextInt();
            list.add(i);

        }
        System.out.println(list);
        sc.close();
    }
}
