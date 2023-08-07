import java.util.*;
public class Driven_Program {
    public static void main(String[] args) {
        System.out.println("---------------welcome to Driven Program----------------");
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Chosse One Number 0 or 1\nPress 1 for Continue.\nPress 0 For End");
        int a = sc.nextInt();
          if (a == 1) {
                System.out.println("Enter Your Marks Out of 100");
                int b = sc.nextInt();
                if (b >= 90) {
                    System.out.println("O grade");
                } else if (b <= 90 && b >= 80) {
                    System.out.println("A Grade");
                } else if (b <= 80 && b >= 70) {
                    System.out.println("B grade");
                } else if (b <= 70 && b >= 60) {
                    System.out.println("C grade");
                } else if (b <= 60 && b >= 40) {
                    System.out.println("D grade");
                } else if (b <= 40 && b >= 33) {
                    System.out.println("Do Hard Work one peace of sheet does not decide your feature");
                } else {
                    System.out.println("Fail");
                }

            } else if (a == 0) {
                System.out.println("Thanks For Visiting");
                break;


            } else {
                System.out.println("your Choose Invalid Option");
                System.out.println("--------THANKS----------");
                break;
          }



        }

    }
}
