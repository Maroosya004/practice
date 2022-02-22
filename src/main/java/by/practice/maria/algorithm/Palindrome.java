package by.practice.maria.algorithm;

public class Palindrome {
    public static void main(String[] args) {
        String someString = "вабрлбав";
        int leftSide = 0;
        int rightSide = someString.length() - 1;
        boolean isPalindrome = true;
        while (rightSide > leftSide) {
            if (someString.charAt(leftSide) != someString.charAt(rightSide)) {
                isPalindrome = false;
            }
            leftSide = leftSide + 1;
            rightSide = rightSide - 1;
        }
        if (isPalindrome) {
            System.out.println("Слово является палиндромом");
        } else {
            System.out.println("Слово не является палиндромом");
        }
    }
}

