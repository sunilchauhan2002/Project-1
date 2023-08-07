import java.util.*;
public class problem_6_loop {
    public static void main(String[] args) {
        System.out.println("_______________Problem 1 loop_______________");
        Scanner ref = new Scanner(System.in);
        while (true) {
            System.out.println("ENter Any Number");
            int a = ref.nextInt();
            int num=1;
            System.out.println("The Result Is:-");
            for (int i = 1; i <=a; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print(num +" ");
                    num++;

                }
                System.out.println();

            }
        }
    }
}
