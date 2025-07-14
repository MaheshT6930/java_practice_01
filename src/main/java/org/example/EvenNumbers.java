package org.example;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Using for loop:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nUsing while loop:");
        int j = 1;
        while (j <= 100) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }

        System.out.println("\n\nUsing do-while loop:");
        int k = 1;
        do {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k++;
        } while (k <= 100);
    }
}
