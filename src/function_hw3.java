import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class function_hw3 {
    public static int giveTable(int a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range of Table");
        int r = sc.nextInt();
        System.out.println("The Table of " + a + " is:");
        for (int i = 1; i <= r; i++) {
            int mul = a * i;
            System.out.println(a + "*" + i + "=" + mul);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Table of Any Number By using Function");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Any Number");
            int a = sc.nextInt();
            giveTable(a);
            sc.nextLine();
            System.out.println("DO YOU WANT TO CONTINUE PRESS Y\nFOR EXIT PRESS N ");
            String n = sc.nextLine();
            if (n.equalsIgnoreCase("Y")) {
                System.out.println("you choose continue");
            }
            else if (n.equalsIgnoreCase("N")) {
                break;
            }
            else {
                System.out.println("You Choose Invalid Option");
                break;
            }
        }
    }
}
