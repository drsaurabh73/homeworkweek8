package week8;

import java.util.Scanner;

public class Programme14 {

    public static void main(String[] args) {
        Programme14 obj14 = new Programme14();
        obj14.diamond();
    }


    public void diamond() {

        int i, j, r;
        System.out.println("Enter the number of rows (Half of the Diamond): ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

        for (i = 0; i <= r; i++) {
            for (j = 1; j <= r-i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2*i-1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for (i = r - 1; i >= 1; i--) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }


    }
}
