package Day4;

public class OperatorDemo {
    static void main(String[] args) {
        //.Arithmetic Operators: + - * / %
        //priority: + -(low) * / %(high)
        //Associativity: Left to Right

        System.out.println(7/3);//2 quotient
        System.out.println(7%3);// 1 remainder

        int a = 4+5 - 7/3 +3*5 - 7%2;
        System.out.println(a);
    }
}
