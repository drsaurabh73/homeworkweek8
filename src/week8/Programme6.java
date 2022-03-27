package week8;

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        triangle();
    }

    public static void triangle() {
        int i,j,n;
        System.out.println( "Input Number of rows:  ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i=1; i<=n; i++) {
            for(j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }


}
