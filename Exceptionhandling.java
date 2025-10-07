import java.util.Scanner;
public class Exceptionhandling {

    void exp(){
        // here we will see the example of the exception handling
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();
        try{
            int result = dividend/divisor;
            System.out.println("The answer is : "+ result);
        }
        catch(ArithmeticException e){
            System.out.println("The exception is :"+e.getMessage());
        }


    }
}
