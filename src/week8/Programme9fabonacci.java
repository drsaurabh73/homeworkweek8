package week8;

public class Programme9fabonacci {

    public static void main(String[] args) {

        Programme9fabonacci obj9 = new Programme9fabonacci();
        obj9.fabon();

    }
    public int fabon() {
        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.println("Fabonacci Series of  "+maxNumber+" numbers:");

        for (int i =1; i<= maxNumber; ++i) {
            System.out.println(previousNumber + "  ");
            /* on each iteration we are assigning second number
             * to the first number and assigning the sum of last two numbers to the second number
             */
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        return fabon();
    }

}
