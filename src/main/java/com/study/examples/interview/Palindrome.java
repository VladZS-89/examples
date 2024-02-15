package main.java.com.interview;


public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindome("мир или риМ"));
        System.out.println(isPalindome(Integer.toString(102)));
        System.out.println(isPalindrome2("101"));
        System.out.println(isPalindrome2(Integer.toString(102)));
    }

    public static boolean isPalindome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
}
