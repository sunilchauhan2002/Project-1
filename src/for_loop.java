import java.util.*;
public class for_loop {
    public static void main (String[]args){
        System.out.println("Print any number by using loop condition");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int a = sc.nextInt();
        System.out.println("enter the range ");
        int b=sc.nextInt();
        System.out.println("the number are:");
       if(a<b) {
           for (int c = a; a <= b; a++) {

               System.out.println(a);

           }
           System.out.println("---------------THANKS-------------------");
       }
       else {
           for (int c = a; a >= b; a++) {

               System.out.println(a);

           }
           System.out.println("---------------THANKS-------------------");
       }
    }

}
