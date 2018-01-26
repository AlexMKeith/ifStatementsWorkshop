package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int bringMe = int (1);
//        int toLife = int (1);
//        if (bringMe == toLife) {
//            System.out.println("WAKE ME UP, WAKE ME UP INSIDE, CAN'T WAKE UP, CALL MY NAME AND SAVE ME FROM THE DARK.");
//        }
//        int count = (0);
//        while (count < 999999999) {
//            count = (count + 1);
//            if (count % 3 == 0 && count % 5 == 0) {
//                System.out.println("Fizz buzz");
//            } else if (count % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (count % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(count);
//            }
//        }
//    }
//}

/* for (int i = 1; i <= 100 ; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("Fizz buzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz"):
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        }
    }
 */
//        int grade = new Scanner(System.in);
        int grade = input.nextInt();
        if (grade < 45) {
            System.out.println("F");
        } else if (grade < 49 && grade > 45) {
            System.out.println("D");
        } else if (grade < 59 && grade > 50) {
            System.out.println("C");
        } else if (grade < 80 && grade > 60) {
            System.out.println("B");
        } else if (grade > 80) {
            System.out.println("A");
        }
    }
}