import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
public class Assign {
    public static void main(String[]args){
        System.out.println("send to relese_1");
        System.out.println("---welcome----");
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose Any Option");
        System.out.println("Press 1 For Palindoram Number Calulator\nPress 2 for Armstrong Number Calulator\nPress 3 for Prime Number Calulator");
        int a= sc.nextInt();
        switch (a) {
        case 1:

                    System.out.println("Palindoram Number Calulator");
                    System.out.println("Enter Any Number ");
                    int b = sc.nextInt();
                    int rev = 0, c, d;
                    c = b;
                    while (b > 0) {
                        d = b % 10;
                        rev = (rev * 10) + d;
                        b = b / 10;
                    }
                    if (c == rev) {
                        System.out.println("this is panlandroum num");
                    } else {
                        System.out.println("not panalandroum number");
                    }
                    break;


        case 2:
                System.out.println("Armstrong Number Calulator");
                System.out.println("Enter Any Number");
                int arm=sc.nextInt();



                break;

            case 3:
                System.out.println("Prime Number Calulator");
                break;

            default:
                System.out.println("You Choose Invalid Option Please Try Again");

        }
    }
}
