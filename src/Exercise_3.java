import java.util.*;
public class Exercise_3 {
    public static int greatNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Number");
         int a= sc.nextInt();
        System.out.println("Enter The Second Number:");
        int b= sc.nextInt();
        if (a>b){
            System.out.println(a+" is Greater Than "+b);
        }
        else {
            System.out.println(b+" is Greater Than "+a);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Greatest Number Findout");
        greatNumber();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Do You Want To Exit From The Program. Y/N");
            String decsion = sc.nextLine();

            if (decsion.equalsIgnoreCase("Y")) {
                System.out.println("Thanks");
                break;

            } else if (decsion.equalsIgnoreCase("N")) {
                System.out.println("You Choose Continue");
                greatNumber();

            } else {
                System.out.println("You Choose Inavlid Option");
                System.out.println("Please Choose Correct Option");




            }
        }

    }
}

