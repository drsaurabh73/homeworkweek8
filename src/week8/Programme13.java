package week8;

import java.util.Scanner;

public class Programme13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter First number: ");
        int x = sc.nextInt();
        System.out.println(" Enter the Second number:");
        int y = sc.nextInt();
        System.out.println(hasSharedDigit(x, y));
    }

    public static boolean hasSharedDigit(int a, int b) {

        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
            while (a > 0) {
                int lastdiget1 = a % 10;
                int lastdiget2 = b % 10;
                int firstdiget1 = a / 10;
                int firstdiget2 = b / 10;
                if ((lastdiget1 == lastdiget2)||(lastdiget1 == firstdiget2) || (firstdiget2 == lastdiget1) || (firstdiget1 == lastdiget2)) {
                    return true;
                }
                a /= 10;
                b /= 10;
            }
            return false;

        }
    }
