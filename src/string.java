import java.sql.SQLOutput;
import java.util.*;
public class string {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First String");
        String s1=sc.nextLine();
        System.out.println("Enter Second String");
        String s2 =sc.nextLine();
        String s3="kumar ";
        String s4= s1.concat(s3+s2);
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("s1 is equal to s2");
        }
        else {
            System.out.println("not equal");
        }

    }
}
