package packone;

public class palindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(113111));
    }
    static boolean isPalindrome(int x){
        String numbers = String.valueOf(x);
        int middle_index = numbers.length() / 2;
        for(int i = 0; i < middle_index; i++){
            char firstNumbers = numbers.charAt(i);
            char lastNumbers = numbers.charAt(numbers.length() - i - 1);
            if (firstNumbers != lastNumbers){
                return false;
            }
        }
        return true;
    }
}
