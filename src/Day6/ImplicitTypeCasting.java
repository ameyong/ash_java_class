package Day6;

public class ImplicitTypeCasting {
    static void main(String[] args) {
        byte b = 100;
        short s = b;
        int i = s;
        long l = i;
        float f = i;
        double d = f;

        System.out.println(" b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
    }
}
