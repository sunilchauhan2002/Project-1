import java.util.*;
public class function_hw1 {
public static int calculatePrimeNumber(int n){
    int inc=0;
    for (int i = 1; i <=n; i++) {
        if (n % i == 0) {
            inc++;
        }
    }
     if (inc==2){
            System.out.println("Prime NUmber");
        }
        else {
            System.out.println("Not a Prime Number");
        }



    return n;
}

    public static void main(String[] args) {
        System.out.println("-----------Prime Number Home Work Problem--------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n=sc.nextInt();
        n=calculatePrimeNumber(n);

    }
}
