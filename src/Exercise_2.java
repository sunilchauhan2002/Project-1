import java.sql.SQLOutput;
import java.util.*;
public class Exercise_2 {
    public static void oddSum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        System.out.println("the Odd Number Are:");
        for (int i = 1; i <=num; i++) {
            if (i%2!=0) {
                System.out.print(i+",");
            }
        }
        System.out.println("\nDo You Want To Sum of Odd Numbers\nPress Y For Yes \nPress N For No");
        sc.nextLine();
        String Decison= sc.nextLine();
        if (Decison.equalsIgnoreCase("Y")){
            System.out.println("The sum of Odd num is ;");
            int sum=0;
            for (int i = 1; i <=num; i++) {
                if (i%2!=0) {
                     sum=sum+i;

                }
            }
            System.out.println(sum);

            } else if (Decison.equalsIgnoreCase("N"))
            {

            System.out.println("Thanks");


        }
    }


    public static void main(String[] args) {
        System.out.println("sum of odd number");
        oddSum();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Do You Want To Exit From The Program. Y/N");
            String decsion = sc.nextLine();

            if (decsion.equalsIgnoreCase("Y")) {
                System.out.println("You Choose Continue");
                oddSum();


            } else if (decsion.equalsIgnoreCase("N")) {
                System.out.println("Thanks");
                break;
            } else {
                System.out.println("You Choose Inavlid Option");
                System.out.println("Please Choose Correct Option");




            }
        }

    }
    }

