public class L_2_3_10 {

    public static boolean isPalindrome(String text) {
        text=text.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        return text.equals(new StringBuilder(text).reverse().toString());
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
}
