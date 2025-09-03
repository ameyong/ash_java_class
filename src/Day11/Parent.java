package Day11;

public class Parent {

    public Parent() {
        System.out.println("Parent's default constructor");
    }

    public Parent (String name) {
        System.out.println("Child parameterized constructor");
    }
    String name = "Parent's name";

    public void greet(){
        System.out.println("Hello, good morning from parents");
    }
}
//not inherited
//private members
//hidden variables
//overridden methods