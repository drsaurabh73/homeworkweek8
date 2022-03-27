package week8;

import java.util.Scanner;

    public class FirstAndLastDigitSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input any Number : ");
            int userNumber = sc.nextInt();
            System.out.println("Sum of first and last digits are : " + sumFirstAndLastDigit(userNumber));
        }

        public static int sumFirstAndLastDigit(int a) {
            int sum = 0;
            int lastdigit = a % 10;
            while (a != 0) {
                int b = a % 10;
                sum = b;
                a = a / 10;
            }
            return lastdigit + sum;
        }
    }

