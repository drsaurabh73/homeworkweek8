package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {

        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Intreaset:"   +s.getRateOfIntrest());
        System.out.println("ICICI Rate of Intreast:"  +i.getRateOfIntrest());
        System.out.println("AXIS Rate of Intreast: "  +a.getRateOfIntrest());
    }
}
