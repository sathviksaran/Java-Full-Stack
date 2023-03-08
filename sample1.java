import java.util.Scanner;
public class sample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        String sentence = sc.nextLine();
        sc.close();
        
        
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(reverseWord(words[i])).append(" ");
        }
        String reversed = sb.toString().trim();
        
        
        String replaced = replaceVowels(reversed);
        
        System.out.println(replaced);
    }
    
    public static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
    
    public static String replaceVowels(String sentence) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            int place=0;
            if (isVowel(ch)) {
                if (ch==Character.toLowerCase(ch)){
                    place = ch - 'a' + 1;
                } else {
                    place = ch - 'a' + 33;
                }
                sb.append(place);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}