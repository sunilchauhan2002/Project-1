import java.sql.SQLOutput;
import java.util.*;
public class Exercise_1 {
    public static void averageNumber() {
        System.out.println("average of number");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The First Number");
            int first = sc.nextInt();
            System.out.println("Enter The Second Number");
            int second = sc.nextInt();
            System.out.println("Enter The Third Number");
            int Third = sc.nextInt();
            int sum = first + second + Third;
            int av = sum / 3;
            sc.nextLine();
            System.out.println("The Average Of 3 Number:" + av);
        }
        public static void main (String[]args){
            averageNumber();

            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Do You Want To Continue\nPress Y for Yes\nPress N For No");
                String decsion = sc.nextLine();

                if (decsion.equalsIgnoreCase("Y")) {
                    System.out.println("You Choose Continue");
                    averageNumber();


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

