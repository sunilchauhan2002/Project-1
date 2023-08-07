import java.util.*;
public class function {
    public static String printMyName(String name) {
        System.out.println("The Result Is: " + name);
        return "sunil";
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter Your Name");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            function.printMyName(name);
            sc.nextLine();
            System.out.println("Enter any key for continue and n for exit ");
            String n =sc.nextLine();
            if(n.equalsIgnoreCase("N"))
            {
                break;
            }

        }
    }
}
