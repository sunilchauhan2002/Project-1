import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

import java.sql.SQLOutput;
import java.util.*;
public class calculator_by_using_switch {
    public static void main(String[]args){
        System.out.println("--------------------Calculator By Using Switch Condition----------------------");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("What Do You Want...?");
        System.out.println("Press 1 For Sum\nPress 2 For Substract\nPress 3 For Multiple\nPress 4 For Divide\nPress 5 for modulas");
        int c= sc.nextInt();
        switch (c){
            case 1:
                c=a+b;
                System.out.println("The Sum of First And Second Number is:"+c);
                break;
            case 2:
                c=a-b;
                System.out.println("The Substration of First And Second Number is:"+c);
                break;
            case 3:
                c=a*b;
                System.out.println("The Multiplication of First And Second Number is:"+c);
                break;
            case 4:
                c=a/b;
                System.out.println("The Division of First And Second Number is:"+c);
                break;
            case 5:
                c=a%b;
                System.out.println("The Modulas of First And Second Number is:"+c);
                break;
            default:
                System.out.println("Chutiya H kya ..?");
        }
        System.out.println("--------------------Thanks----------------------");
    }

}
