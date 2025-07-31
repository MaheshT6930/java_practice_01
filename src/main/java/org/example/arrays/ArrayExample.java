package org.example.arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args){
        // create and initializing array
        int[] numbers = {5, 2,9,1,7};
        //Acess elements
        System.out.println("First Element: " + numbers[0] );

        // update element
        numbers[1] = 10;
        System.out.println("Updated Second Element: " + numbers[1]);

        // length of the array
        System.out.println("Length: " + numbers.length );
        //Iterate using the loop
        System.out.println("All Elements:");
        for (int i=0; i< numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
        System.out.println();

        // Iterate using For-Each Loop
        System.out.println("Using for each loop");
        for( int num  : numbers) {
            System.out.println(num + " ");
        }
        System.out.println();

        //Sort array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        //Search in array ( binary search, must be sorted)
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println(" Index of 7 : " + index);

        //copy array
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copy));

        //Fill array with one value
        Arrays.fill(copy, 100);
        System.out.println("Filled array: " + Arrays.toString(copy));

    }
}
