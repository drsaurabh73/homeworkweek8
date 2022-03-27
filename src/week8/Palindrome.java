package week8;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer Number");
        int inputnumber = sc.nextInt();
        System.out.println(isPalindrome(inputnumber));

    }

    public static boolean isPalindrome(int number) {
        int a = 0;
        int originalnumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            a = (a * 10) + lastDigit;
            number /= 10;
        }
        return originalnumber == a;
    }
}
