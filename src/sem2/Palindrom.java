package sem2;

public class Palindrom {
    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase(); // убираем пробелы и делаем один регистр
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("а роза упала на лапу азора"));
    }
}
