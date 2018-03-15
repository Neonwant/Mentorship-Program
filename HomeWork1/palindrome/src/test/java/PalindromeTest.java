import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {
    private Palindrome palindrome;

    @Before
    public void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void successCheckPalindromeTest() {
        String text = "asdsa";
        boolean result = palindrome.checkPalindrome(text);
        Assert.assertEquals(Boolean.TRUE, result);
    }
}