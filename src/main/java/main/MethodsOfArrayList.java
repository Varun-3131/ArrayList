package main;

import java.util.ArrayList;

public class MethodsOfArrayList {
    public static void main(String[] args) {

        // Declare ArrayList with name "list"...
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // Add elements to ArrayList...
        list.add(1);    // Add 1 to list
        list.add(2);    // Add 2 to list
        list.add(3);    // Add 3 to list
        list.add(4);    // Add 4 to list
        list2.add("Hello"); // Add "Hello" to list2
        list2.add("World"); // Add "World" to list2
        list2.add("!!!");   // Add "!!!" to list2

        // Print ArrayLists
        System.out.println("List 1: " + list);
        System.out.println("List 2: " + list2);

        // Get elements at specific indices...
        int element1 = list.get(2);     // Get element at index 2 in list
        String element2 = list2.get(1); // Get element at index 1 in list2
        System.out.println("Element at index 2 in list: " + element1);
        System.out.println("Element at index 1 in list2: " + element2);

        // Remove elements at specified indices...
        list.remove(2);     // Remove element at index 2 in list
        list2.remove(1);    // Remove element at index 1 in list2
        System.out.println("List 1 after removing element at index 2: " + list);
        System.out.println("List 2 after removing element at index 1: " + list2);

        // Set element at specified index...
        list.set(2, 10);    // Set element at index 2 in list to 10
        list2.set(2, "???"); // Set element at index 2 in list2 to "???"
        System.out.println("List 1 after setting element at index 2: " + list);
        System.out.println("List 2 after setting element at index 2: " + list2);

        // Check whether elements are present or not...
        boolean containsElement1 = list.contains(2);      // Check if list contains 2
        boolean containsElement2 = list2.contains("Hello"); // Check if list2 contains "Hello"
        System.out.println("List 1 contains 2: " + containsElement1);
        System.out.println("List 2 contains \"Hello\": " + containsElement2);

        // Get the size of ArrayLists...
        System.out.println("Size of list: " + list.size());
        System.out.println("Size of list2: " + list2.size());
    }
}
