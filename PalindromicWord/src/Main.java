import java.util.*;
public class Main {

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word;
        System.out.print("kelime yazınız : ");
        word = scan.nextLine();
        System.out.println(isPalindrome(word));


    }
}