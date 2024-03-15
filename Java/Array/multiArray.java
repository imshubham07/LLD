package Array;

public class multiArray {
    public static void main(String[] args) {
        
// Creation of 2D Array
        // int arr[][] = new int[4][5];

// Initialisation of 2D Array
        int arr[][]= {
            {2,4,9},
            {8,6,1},
            {9,7,3},
        };

        //find the size of Row and Column
        int rowSize = arr.length; 
        int colmSize = arr[0].length;
        System.out.println("Row size : "+rowSize + " columnSize is: "+colmSize);

        int sum = 0;
        //sum of 2D Array
         for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colmSize; j++) {
                sum = sum + arr[i][j];
            }
         }
         System.out.println("Sum of given Array: "+ sum);

//printing 2D Array
        // for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
        //     //jis bhi row per  ho , uske liye sabhi columns pr jao
        //     for (int collIndex = 0; collIndex < colmSize; collIndex++) {
        //         System.out.print(arr[rowIndex][collIndex]+ " ");
        //     }
        //     System.out.println();
        // }

        // //printing through for each Loop of 2D Array
        //  for (int[] temp : arr) {
        //     for (int num : temp) {
        //         System.out.println(num);
        //     }
        //  }

    }
    
}
