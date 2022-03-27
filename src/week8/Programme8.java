package week8;

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {

        Programme8 obj8 = new Programme8();
        obj8.nestTriangle();
    }

    public  void nestTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the right angle triange pattern row: ");
        int rows = sc.nextInt();
        int i = 1, j;
        while (i <= rows) {
            j = 1;
            while (j <= i) {
                System.out.print("@");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
