public class Palindrome {

    /**
     * Determine if passed string is palindrome.
     * Algorithm complexity is O(n) in all cases.
     *
     * @param text
     * @return boolean value depends on result
     */
    public boolean checkPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1))
                return false;
        }
        return true;
    }

}
