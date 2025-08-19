package org.example;

import java.util.Scanner;

public class Practice {

        public static void main(String[] args) {
            //int a= 12;
            int b= 15;
            int c=18;
//            System.out.println("a value after Round to nearest 10 : " + (Math.round(a/10.0))*10);
//            System.out.println((Math.round(b/10.0))*10);
//            System.out.println((Math.round(c/10.0))*10);
           //99 int a= 299;
            Scanner sc= new Scanner(System.in);
            System.out.println("enter a valuue:");
            int a = sc.nextInt();

            System.out.println(((a + 99)/100)*100);


        }

}
