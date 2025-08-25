package Day7;

import java.util.Scanner;

public class WhileLoopDemo2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter name:");
            String name = sc.next();
            if(name.equals("Ashim")){
                flag = false;
            }
            System.out.println("Name: " + name);
        }
        System.out.println("rest of the code.");
    }

}
