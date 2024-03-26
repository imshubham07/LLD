package Function;

public class func {
    public static void main(String[] args) {

    //    int sum =  getSum(10, 34);
    //     System.out.println(sum);
        
        // System.out.println(10);
        // callMyName();
        // System.out.println(40);
        callMyName("love with code");

    }

    public static int getSum(int a, int b){
        int sum = a + b;
        return sum;
        // System.out.println("My name is Shubham"); // this line never exexute
    }

    public static void callMyName(){
        System.out.println(20);
        System.out.println("Shubham Dubey");
        System.out.println(35);
        return;
    }
    
    public static void callMyName(String name){
        System.out.println(name);
    }
}
