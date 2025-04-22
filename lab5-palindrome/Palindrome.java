import java.util.logging.Logger;

public class Palindrome {
    private static final Logger logger = Logger.getLogger(Palindrome.class.getName());

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        logger.info(String.valueOf(isPalindrome("radar"))); // true
    }
}