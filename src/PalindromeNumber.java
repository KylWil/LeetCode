public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        String palindrome = Integer.toString(x);
        for (int i = 0; i < palindrome.length()/2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}