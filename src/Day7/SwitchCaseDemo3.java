package Day7;

import java.util.Scanner;

public class SwitchCaseDemo3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice");
        String choice = sc.next();
        switch (choice) { //start
            case "add":
                System.out.println("Addition");
                break;
            case "sub":
                System.out.println("Subtraction");
                break;
            case "multi":
                System.out.println("Multiplication");
                break;
            case "div":
                System.out.println("Division");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }//end
        System.out.println("rest of the code");

    }
}


