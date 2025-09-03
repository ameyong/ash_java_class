package Day11;

public class Child extends Parent {

    public Child(){
        super("Child");
        System.out.println("Child's default constructor");
    }
    public Child(String name){
        System.out.println("Child parameterized constructor");
    }
    String name = "child's name";

    public void greet(){
        System.out.println(name);
        System.out.println(super.name);
        System.out.println("Hello, good morning from child");
        super.greet();
    }


}
