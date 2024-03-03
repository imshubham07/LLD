package Basics;

import java.math.BigInteger;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //Creatte a object of  Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your Float number: ");
        float f = sc.nextFloat();

        System.out.println("Enter your big Number: ");
        BigInteger bg = sc.nextBigInteger();

        System.out.println("My age is: " + age);
        System.out.println("My Float Number is: " + f);
        System.out.println("My BigNumber is: " + bg);
        // it is necessary becouse it prevent  to resourse leak
        sc.close();
    }
}
