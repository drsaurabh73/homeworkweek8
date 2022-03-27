package week8;

public class Programme15Triangle {

    public static void main(String[] args) {
        Programme15Triangle obj15 = new Programme15Triangle();
        obj15.Triangle();

    }
    public int Triangle() {
        int rows = 5;

        for (int x=1; x<= rows; x++) {
            for (int i = 1; i <= x; i++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

        return rows;
    }
}
