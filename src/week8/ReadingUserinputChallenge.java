package week8;

import java.util.Scanner;

public class ReadingUserinputChallenge {
    public static void main(String[] args) {

        ReadingUserinputChallenge obj = new ReadingUserinputChallenge();
        obj.sum1();

    }

public void sum1() {
            Scanner sc = new Scanner(System.in);
            int i = 1;
            int sum = 0;
            while (i <= 10) {
                System.out.println("Enter the given number:" + i);

                boolean validNumber = sc.hasNextInt();
                if (validNumber) {
                    int num = sc.nextInt();
                    sum += num;
                    i++;
                } else {
                    System.out.println("Invalid number");
                }
                sc.nextLine();

            }
            System.out.println("Sum of all number =" + sum);
        }
}


