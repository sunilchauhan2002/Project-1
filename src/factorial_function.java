import java.util.*;
public class factorial_function {
    public static void calculateFactorial(long n){
        //For Loop
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        System.out.println("The Factorial Of "+n+" is:");
        long fact=1;
        for (long i =n; i >=1; i--) {
              fact= fact*i;

        }
        System.out.println(fact);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number For Factorial");
        long n= sc.nextInt();
        calculateFactorial(n);

    }
}
