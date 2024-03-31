package expHandling;

public class ThrowExceptionHandling {
    public static void printName(String name) throws ArithmeticException, NullPointerException{
        if (name.equalsIgnoreCase("shubham")) {
            throw new NullPointerException("Koi Exception aaya hai yaha par ");
        }
        System.out.println(name);
    }
    public static void main(String[] args) {
        try{
            printName("shubham");
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }
        finally{
             System.out.println("Code Complete ho gya hai");
        }
    }
}
