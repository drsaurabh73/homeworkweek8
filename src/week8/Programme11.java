package week8;

import java.util.Scanner;

public class Programme11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Given integer");
        int s = sc.nextInt();
        getEvenDigitSum(s);

        if (getEvenDigitSum(s) != -1) {
            System.out.println("The sum of even digits of the given number [" + s + "] is : " + getEvenDigitSum(s));
        } else {

            System.out.println("Invalid Input." + getEvenDigitSum(s));
        }
    }
        public static int getEvenDigitSum(int number){

            int total = 0;
            if (number > 0) {
                while (number != 0) {
                    int even = number % 10;
                    if (even % 2 == 0) {
                        total += even;
                    }
                    number /= 10;
                }
                //System.out.println(total);
            }else
                total = -1;

            return total;

        }
    }
