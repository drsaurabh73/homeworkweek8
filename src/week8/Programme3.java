package week8;

import java.util.Scanner;

public class Programme3 {

    public static void main(String[] args) {
        Programme3 obj = new Programme3();
        obj.vowel1();

    }

    public void vowel1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an Alphabet");
        String input1 = sc.next().toLowerCase();
        char input = input1.charAt(0);

        boolean vowels = input1.equals("a") || input1.equals("e") || input1.equals("i") || input1.equals("o") || input1.equals("u");
        boolean flag = Character.isAlphabetic(input);
        if (input1.length() == 1 && flag) {
            // System.out.println("Error. Not a single character");

            if (vowels) {
                System.out.println("input letter is Vowel");
            } else  {
                System.out.println(" Input letter is Consonant");
            }
        } else {

            System.out.println("Error. Invalid input");
        }


    }
}
