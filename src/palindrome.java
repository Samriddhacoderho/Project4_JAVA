import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String name = sc.next();
        String prem = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            prem = prem + name.charAt(i);
        }
        if (name.equalsIgnoreCase(prem)) {
            System.out.println("The word is palindrome!");
        }
        else{
            System.out.println("The word is not palindrome");
        }
    }
}
