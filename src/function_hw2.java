import sun.awt.windows.WBufferStrategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class function_hw2 {
    public static int calculateEvenNumber(int a) {
        if (a % 2 == 0) {
            System.out.println("This Number is a Even Number");
        } else {
            System.out.println("This Number is a Odd Number");
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("===========Check Even or Odd Number Home Work Problem======== ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Any Number");
        int a= br.read();
        function_hw2.calculateEvenNumber(a);
    }
}
