package Day6;

public class NestedIfElse {
    static void main(String[] args) {

        int a = 4;
        int b = 5;
        int c = 7;
        if (a > b) {
            if (a > c) {
                System.out.println("a is largest one");
            } else {
                System.out.println("c is largest one");
            }
        }else {
            if(b > c) {
                System.out.println("b is largest one");
            } else {
                System.out.println("c is largest one");

            }
        }
        System.out.println("rest of the code.");
    }
}