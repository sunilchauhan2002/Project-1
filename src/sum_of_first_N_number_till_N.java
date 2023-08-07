import java.util.*;

public class sum_of_first_N_number_till_N {
    public static void main(String[]args){
        System.out.println("-------Print The sum of N natural Number By using for loop--------");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Natural Number");
        int a=sc.nextInt();
        System.out.println("Enter the Range");
        int b=sc.nextInt();
        int sum=0;
        for (int d=a; a<=b; a++){
            sum=sum+a;
            System.out.println(a);

        }
        System.out.println("The Result:"+sum);


    }

}


