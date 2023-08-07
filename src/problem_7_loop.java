import java.util.*;
public class problem_7_loop {
    public static void main(String[] args) {
        System.out.println("_______________Problem 1 loop_______________");
        Scanner ref = new Scanner(System.in);
        while (true) {
            System.out.println("ENter The First Number");
            int a = ref.nextInt();
            System.out.println("The result is :-");
            for ( int i = 1; i <=a ; i++) {
                for ( int j = 1; j <=i; j++) {
                    int sum=i+j;
                    if (sum%2==0){
                        System.out.print("+ ");
                    }
                    else {
                        System.out.print("- ");
                    }


                }
                System.out.println();
            }
        }
    }
}
