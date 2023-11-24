import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Your name in reverse looks like this:");
        for (int i = (name.length()) - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}

