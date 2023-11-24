import java.util.Scanner;

public class getChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Now, enter index to get the corresponding character:");
        int x = sc.nextInt();
        if (x < 0 || x >= name.length()) {
            System.out.println("Error! Invalid index");
        } else {
            System.out.println("The character at index "+x+" is:"+name.charAt(x));
        }
    }
}
