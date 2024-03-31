package expHandling;



public class Learnig_Exception {
    public static void main(String[] args) {


        // int a =  5/0;
        


        System.out.println("Before");
        try {
            int arr[] = new int[5];
            System.out.println(arr[100]);
            int a = 5/0;
            System.out.println(a);
        }

        catch (ArithmeticException | ArrayIndexOutOfBoundsException err) {
            System.err.println(err.getMessage());
            System.out.println("We need to Handle the Expection");// TODO: handle exception
        }

        finally{
            System.out.println("Mai to Execute hoke rahunga");
        }
        System.out.println("after");



    }
}
