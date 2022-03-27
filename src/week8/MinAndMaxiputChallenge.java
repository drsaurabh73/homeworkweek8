package week8;

import java.util.Scanner;

public class MinAndMaxiputChallenge {

    public static void main(String[] args) {
        MinAndMaxiputChallenge obj1 = new MinAndMaxiputChallenge();
        obj1.max1();

    }

    public void max1() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int min = 0;
        int max = 0;
        boolean bsolved = true;

        while (true) {
            int a = count++;
            System.out.println("Enter the Number # " + (a + 1) + ":");
            boolean isValid = sc.hasNextInt();
            if (isValid) {
                int num = sc.nextInt();

                if(bsolved) {
                  bsolved = false;
                    min = num;
                    max = num;
                }

                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }} else {
                    System.out.println("invalid input..");
                    break;
                }
                sc.nextLine();

            }
            System.out.println("Min Number:" + min);
            System.out.println("Max Number:" + max);
        }
    }
