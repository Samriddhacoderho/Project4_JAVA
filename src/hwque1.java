public class hwque1 {
    public static void main(String[] args) {
        String word = "Nepal";
        int countVowel=0;
        int countConsonent=0;
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) == 'a') || (word.charAt(i) == 'e') || (word.charAt(i) == 'i') || (word.charAt(i) == 'o') || (word.charAt(i) == 'u')) {
                countVowel+=1;
            }
            else{
                countConsonent+=1;
            }
        }
        System.out.println("The number of vowels present is:"+countVowel);
        System.out.println("The number of consonents present is:"+countConsonent);
    }
}
