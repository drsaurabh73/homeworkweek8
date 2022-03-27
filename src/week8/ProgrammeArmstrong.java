package week8;

import java.util.Scanner;

public class ProgrammeArmstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the given integer");
        ProgrammeArmstrong obj10 = new ProgrammeArmstrong();
        int armnumber = sc.nextInt();
        System.out.println(obj10.isArmstrongnumber(armnumber));

    }
    public String isArmstrongnumber (int a) {
        double sum = 0;
        int digit = 0;
        int last = 0;
        String message;
        int temp = a;
        while (temp >0) {
            temp = temp / 10;
            digit++;
        }
        temp = a;
        while (temp>0) {
            last = temp % 10;
            sum = sum + (Math.pow(last, digit));
            temp = temp / 10;
        }
        if (a==sum) {
            message = "Given Number is Armstrong Number";
        } else {
            message = "Given Number is not Armstrong Number";


        }
        return message;
    }
}
