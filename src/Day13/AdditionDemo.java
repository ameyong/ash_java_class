package Day13;

import Day1.Addition;

public class AdditionDemo {
    public void sum(int a) {
        int b = 5;
        int add = a + b;
        System.out.println("1.Sum is:" + add);
    }

    public void sum(int a, int b) {
        int add = a + b;
        System.out.println("2.Sum is:" + add);
    }

    public void sum(int a, int b, int c) {
        int add = a + b + c;
        System.out.println("3.Sum is:" + add);
    }

    public void sum(double a, double b) {
        double add = a + b;
        System.out.println("4.Sum is:" + add);
    }

    public void sum(double a, int b) {
        double add = a + b;
        System.out.println("5.Sum is:" + add);
    }

    public void sum(int a, double b) {
        double add = a + b;
        System.out.println("6.Sum is:" + add);
    }

    static void main(String[] args) {
        AdditionDemo demo = new AdditionDemo();
        demo.sum(1,2);
        demo.sum(2.4,3.5);
    }
}
