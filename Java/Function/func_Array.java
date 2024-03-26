package Function;

public class func_Array {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        printArray(arr);
        getSum(arr);
    }
    public static void getSum(int arr[]){
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public static void printArray(int arr[]){
        for (int i : arr) {
            System.out.println(" thr given Array is : " + i);
        }
    }
    
}
