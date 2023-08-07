import java.util.*;
public class Season_Calculator {
    public static void main(String[] args) {
        System.out.println("--------------------SEASON CALCUTAOR-------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find Season out the Of Any Month. \nPlease Enter Total Number Days are in That Month ");
        int a = sc.nextInt();
        if (a == 28) {
            System.out.println("This is Febuary Month\nTo Find out The Season Please Enter 1 ");
            int b=sc.nextInt();
            if (b==1){
                System.out.println("Febuary is Winter Season Month");
            }
            else {
                System.out.println("You Choose invalid Option Please Try Again..!");
            }

        } else if (a == 29) {
            System.out.println("This is Febuary Month and It is a Leap Year\nTo Find out The Season Please Enter 1");
            int b=sc.nextInt();
            if (b==1){
                System.out.println("Febuary is Winter Season Month");
            }
            else {
                System.out.println("You Choose invalid Option Please Try Again..!");
            }

        } else if (a == 30) {
            System.out.println("There Are Many Month Which Contains 30 Days like \nApril\nJune\nSeptember\nNovember");
            System.out.println("To Find The Season :\nFor April Press 1\nFor June Press 2\nFor September Press 3\nFor November Press 4\n");
            System.out.println("Choose Any Number:");
            int c=sc.nextInt();
            switch (c){
                case 1:
                    System.out.println("April is a Spring Season");
                    break;
                case 2:
                    System.out.println("June is a Summer Season");
                    break;
                case 3:
                    System.out.println("September is a Autumn Fall Season");
                    break;
                case 4:
                    System.out.println("November is a Autumn Fall Season");
                    break;
                default:
                    System.out.println("You Choose Invalid Option Please Try Again ");

            }
        }
        else if (a == 31) {
            System.out.println("There Are Many Month Which Contains 31 Days like \nJanuary\nMarch\nMay\nJuly\nAugust\nOctober\nDecember");
            System.out.println("To Find The Season :\nFor January Press 1\nFor March Press 2\nFor May Press 3\nFor July Press 4\nFor August Press 5\nFor October Press 6\nFor December Press 7\n");
            System.out.println("Choose Any Number:");
            int d=sc.nextInt();
            switch (d){
                case 1:
                    System.out.println("January is a Winter Season");
                    break;
                case 2:
                    System.out.println("March is a Spring Season");
                    break;
                case 3:
                    System.out.println("May is a Spring Season");
                    break;
                case 4:
                    System.out.println("July is a Summmer Season");
                    break;
                case 5:
                    System.out.println("August is a Summer Season");
                    break;
                case 6:
                    System.out.println("October is a Autumn Fall Season");
                    break;
                case 7:
                    System.out.println("December is a Winter Season");
                    break;
                default:
                    System.out.println("You Choose Invalid Option Please Try Again ");

            }
        }
        else {
            System.out.println("ONE Month Contain Maximum 31 Days");
        }
        System.out.println("---------------THANKS YOU------------------");
    }
}
