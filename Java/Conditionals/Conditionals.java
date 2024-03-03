package Conditionals;

import java.util.Scanner;

public class Conditionals {

   
    public static void main(String[] args) {
        // int income;
        // System.out.println("Enter Your Income: ");
        Scanner sc = new Scanner(System.in);
        // income = sc.nextInt();

        // // If Statement
        // if (income > 250) {
        //     System.out.println("Mai Amir hu");
        // }

        // // If Else Statement
        
        // System.out.println("Enter your age: ");
        // int age = sc.nextInt();

        // if (age >= 18) {
        //     System.out.println("You are eligible for Vote");
        // } else {
        //     System.out.println("You are not eligible for Vote");
        // }

        // // Ternary Operator
        // System.out.println((income>100000)?"Mai amir hu": "Mai amir nhi hu");


        // //Nested If-Else
        // int age;
        // System.out.println("Enter Your age: ");
        // age = sc.nextInt();
        // boolean KnownDriving;
        // System.out.println("You are Known Driving: ");
        // KnownDriving = sc.nextBoolean();

        // if (age> 18) {
        //     System.out.println("Your age is > 18");
        //     if (KnownDriving) {
        //         System.out.println("You can Get a License");
        //     }
        //     else{
        //         System.out.println("pehle Driving seek k aa bhai");
        //     }
        // }
        // else{
        //     System.out.println("Pehle bade toh hoja bhai");
        // }

        // Switch Case

        int months;
        System.out.println("Enter the months Number: ");
        months = sc.nextInt();

        switch (months) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("dec");
                break;
        
            default:
            System.out.println("plese enter valid month name!!");
                break;
        }



        sc.close();
    }
}
