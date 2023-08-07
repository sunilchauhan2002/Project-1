import java.util.*;
public class recursion {
    public static int methodRecursion(int a) {
        if (a == 0) {
            return 0;
        }
        System.out.println(a);
        methodRecursion(a-1);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Basic Recursion");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int a=sc.nextInt();
        methodRecursion(a);
    }

}
