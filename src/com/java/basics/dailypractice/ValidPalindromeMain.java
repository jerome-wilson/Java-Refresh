public class ValidPalindromeMain {

    public static void main(String[] args) {

        ValidPalindromeLogic obj = new ValidPalindromeLogic();

        String input = "A man, a plan, a canal: Panama";

        boolean result = obj.isPalindrome(input);

        System.out.println("Is Palindrome: " + result);
    }
}
