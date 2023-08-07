import java.util.*;
public class problem_1_loop {
    public static void main(String[]args) {
        System.out.println("_______________Problem 1 loop_______________");
        Scanner ref = new Scanner(System.in);
        while (true) {
        System.out.println("ENter The First Number");
        int a = ref.nextInt();
        System.out.println("Enter the Second number");
        int b = ref.nextInt();

            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    if (i == 1 || j == 1 || j == b || i == a) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
