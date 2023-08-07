import java.util.*;
public class assign_1_loop {
    public static void main(String[] args) {
        System.out.println("--------Welcome To Loop Assignment--------");

        while (true) {
            System.out.println("Press 1 For Rhombus Problem\nPress 2 for number pyramid Problem\nPress 3 for palindromic number pyramid. ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a) {
                case 1:

                    System.out.println("-------Welcome to Rhombus Problem-------");
                    System.out.println("Enter Any Number");
                    int b = sc.nextInt();
                    for (int i = 1; i <= b; i++) {
                        for (int j = 1; j <= b - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= b; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("--------Welcome To Number Pyramid Problem--------");
                    System.out.println("Enter Any Number");
                    int c = sc.nextInt();
                    for (int i = 1; i <= c; i++) {
                        for (int j = 1; j <= c - i; j++) {
                            System.out.print(" ");
                        }

                        for (int j = 1; j <= i; j++) {

                            System.out.print(i +" ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("--------Welcome To Palindromic Number Pyramid Problem------------");
                    System.out.println("Enter Any Number");
                    int d = sc.nextInt();
                    for (int i = 1; i <= d; i++) {
                        //spaces
                        for (int j = 1; j <= d - i; j++) {
                            System.out.print(" ");
                        }


                        //first part
                        for (int j = i; j >= 1; j--) {
                            System.out.print(j);
                        }


                        //second part
                        for (int j = 2; j <= i; j++) {
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("You Choose Invaild Option Please Try Again");
            }
            sc.nextLine();
            System.out.println("DO YOU WANT CONTINUE Y/N ");
            String n=sc.nextLine();

            if(n.equalsIgnoreCase("y")){
               continue;

            }else
            {
                System.out.println("THANKS");
                System.exit(0);
            }

        }
    }
}
