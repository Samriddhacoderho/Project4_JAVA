import java.util.Scanner;

public class sumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int user_numtake = sc.nextInt();
        int n = user_numtake;
        int r=0,s=0;
        while (n != 0) {
            r=n%10;
            s=s+r;
            n=(int)(n/10);
        }
        System.out.println("The sum of the digits in the number "+user_numtake+" is:"+s);
    }
}
