import java.util.*;
public class nested_loop {
    public static void main(String[]args) {
        System.out.println("_______________nested loop concept_______________");
        Scanner ref=new Scanner(System.in);
        System.out.println("ENter The First Number");
        int a= ref.nextInt();
        System.out.println("Enter the Second number");
        int b= ref.nextInt();
        for (int c=1; c<=a; c++){
            for (int d = 1; d <=b; d++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

}
