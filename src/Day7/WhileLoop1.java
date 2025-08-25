package Day7;

public class WhileLoop1 {
    static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 5) {
            sum += i;
            System.out.println("i is: " + i);
            i++;

        }
        System.out.println("Sum is: " + sum);
    }
}
