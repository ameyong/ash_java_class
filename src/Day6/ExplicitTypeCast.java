package Day6;

public class ExplicitTypeCast {
    static void main(String[] args) {
        double d = 100.75;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        System.out.println(" d = " + d);
        System.out.println(" f = " + f);
        System.out.println(" l = " + l);
        System.out.println(" s = " + s);
        System.out.println(" b = " + b);

    }
}
