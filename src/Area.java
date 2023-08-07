import java.sql.SQLOutput;
import java.util.*;
public class Area {
    public static void main (String[]args){
        System.out.println("COmmit to release_1");
        System.out.println("welcome");
        System.out.println("Diameter,Area calculator of circle ");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Radius Of Circle");
        int r= sc.nextInt();
        int Dia;
        Dia = 2*r;
        System.out.println("The Diameter Of Circle is "+Dia);
        System.out.println("if you find the area of circle ");
        System.out.println("Then again Enter the Radius of circle ");
        int e= sc.nextInt();
        float areaf;
        double area = 3.14*(e * e);
        System.out.println("Area of Circle is "+area);
        System.out.println("----------------------Thanks---------------------");

    }
}
