import java.util.*;
public class array1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of arrray");
       int a =sc.nextInt();
       int [] ages=new int[a];

        System.out.println("Enter The Elements ");
        for ( int i = 0; i <a; i++) {
            ages [i]= sc.nextInt();
        }
        System.out.println("the array is");
        for (int i = 0; i <a; i++) {
            System.out.print(ages[i]+",");

        }

    }
}
