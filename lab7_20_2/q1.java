import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("The string after changing the case is: " + changeCase(str));
        System.out.println("The string after reversing is: " + reverseString(str));

        System.out.print("Enter the second string for comparison: ");
        String str2 = sc.nextLine();
        System.out.println("The difference between ASCII value is: " + str.compareTo(str2));

        System.out.print("Enter the string to be inserted into first string: ");
        String insertStr = sc.nextLine();
        System.out.println("The string after insertion is: " + str + " " + insertStr);

        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int pos = str.indexOf(ch);
        System.out.println(pos != -1 ? "Position of entered character: " + pos : "Entered character is not present");

        System.out.println(isPalindrome(str) ? "Entered string is palindrome" : "Entered string is not a palindrome");

        countWordsVowelsConsonants(str);
        sc.close();
    }

    static String changeCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        return sb.toString();
    }

    static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(reverseString(s));
    }

    static void countWordsVowelsConsonants(String s) {
        int words = s.split("\\s+").length, vowels = 0, consonants = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }
}
