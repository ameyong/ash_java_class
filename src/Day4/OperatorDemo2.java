package Day4;

public class OperatorDemo2 {
    static void main(String[] args) {
        //Assignment Operators: = += -= /= *= %=
        //Associativity; Right to left
        int a = 4+5 - 7/3 +3*5 - 7%2;
        System.out.println(a);

        int x = 5;
        System.out.println(x);
        x = x + 2;
        System.out.println(x);
        x+=2; //x = x + 2;
        System.out.println(x);
    }
}
