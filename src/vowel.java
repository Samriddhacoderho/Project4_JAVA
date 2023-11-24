
public class vowel {
    public static void main(String[] args) {
        String name = "SAMRIDDHA";
        name=name.toLowerCase();
        System.out.println("Here are the vowels:");
        for (int i = 0; i < (name.length()) - 1; i++) {
            char x=name.charAt(i);
            if (x=='a'|| x=='e' || x=='i' || x=='o' || x=='u') {
                System.out.println(name.charAt(i));
            }
        }
    }
}
