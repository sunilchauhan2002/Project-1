import java.util.*;
public class problem_4_loop {
    public static void main(String[] args) {
        System.out.println("_______________Problem 1 loop_______________");
        Scanner ref = new Scanner(System.in);
        while (true) {
            System.out.println("ENter Any Number");
            int a = ref.nextInt();
            for (int i = 1; i <=a; i++) {
                //for space print
                for (int j = 1; j <=a-i ; j++) {
                    System.out.print(" ");

                }
                //for * print
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
}