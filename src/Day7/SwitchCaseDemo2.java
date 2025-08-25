package Day7;

import java.util.Scanner;

public class SwitchCaseDemo2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: ");
        char ch = sc.next().charAt(0);
        int a = 0, b = 0;

        if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            System.out.println("Enter first number: ");
            a = sc.nextInt();
            System.out.println("Enter second number: ");
            b = sc.nextInt();

        }

        switch (ch) {
            case '+':
                int sum = a + b;

                System.out.println("Addition is: " + sum);
                break;
            case '-':
                int diff = a - b;
                System.out.println("Subtractiion is: " + diff);
                break;
            case '*':
                int multi = a * b;
                System.out.println("Multiplication is: " + multi);
                break;
            case '/':
                int div = a / b;
                System.out.println("Division is: " + div);
                break;
            default:
                System.out.println("invalid choice");
                break;
        }//end
        System.out.println("rest of the code");


        }
    }

