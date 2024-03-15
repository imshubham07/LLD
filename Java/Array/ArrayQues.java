package Array;

import java.util.Scanner;

public class ArrayQues {
    public static void main(String[] args) {
        
        int arr[] = {103,319,259,379,453,64,6764,345,245};

        // //Taking input in Array 
        // int size;
        // Scanner sc = new Scanner(System.in);//Make a Object for Input
        // System.out.println("Enter the size of array: ");
        // size = sc.nextInt();

        // int arr[];
        // arr = new int[size];

        // for (int count = 1; count < size ; count++) {
        //     int index =  count - 1;
        //     System.out.println("enter the Value for Index: " + index);
        //     arr[index] = sc.nextInt();
        // }

        //printing an Array

        // for (int i : arr) {
        //     System.out.println("Given Array is : " + i);
        // } 

        // int sum = 0;
        // for (int num : arr) {
        //     sum = sum + num;
        // }
        // System.out.println("Sum of Given array is : "+ sum);

// Finding min Value in Array
        int min  = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=min) {
                min = arr[i];
            }
        }
        System.out.println("the min number is :   "+min);

// finding MaxValue In Array
        int MaxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>MaxValue) {
                MaxValue = arr[i];
            }
        }
        System.out.println("The Max Value of Array: "+ MaxValue);





        // sc.close();


    }
}
