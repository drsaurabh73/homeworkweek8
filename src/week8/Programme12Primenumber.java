package week8;

public class Programme12Primenumber {

    public static void main(String[] args) {
        Programme12Primenumber obj12 = new Programme12Primenumber();
        obj12.Prime();

    }

    public  boolean Prime() {
        int rem;
        boolean isPrime = true;
        int a = 18;
        //Loop to check weather the number is divisable by any numbertocheck other than 1
        for (int i = 2; i <= a; i++) {

            //number to check it is divisable by itself
            rem = a % i;
           // System.out.println(a + " Divided by" + i + "gives a reminder" + rem);
            //if the reminder is 0 than number to check is not prime and break loop.
            if (rem == 0) {
                isPrime = false;
                break;
            }


        }
        if (!isPrime) {
            System.out.println(a + " is a Prime number");
        } else {
            System.out.println(a + " is not a Prime number");
        }
return isPrime;

    }

}