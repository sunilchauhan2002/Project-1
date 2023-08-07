import java.util.*;
public class Sum_function {
    public static int calculateSum(int a, int b){
    int sum=a+b;
    return sum;

    }
    public static int calculateProduct(int a,int b){
       int mul= a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b= sc.nextInt();
        int sum=calculateSum(a,b);
        System.out.println("The Result is:"+sum);
        int mul=calculateProduct(a,b);
        System.out.println("The Product is :"+mul);
    }
}
