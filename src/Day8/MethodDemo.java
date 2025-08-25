package Day8;

public class MethodDemo {
    // <access modifier> void <method name> () {
    // ======
    //  }

    //method defination
    public void greet() {
        System.out.println("Hello Hello Hello!!!");
    }
    // <access modifier> void <method name> (one or more than one numbers of parameters of any type){
    // ====
    //  }

    public void displayinfo(String name, int age, double salary, boolean active){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Active: " + active);
    }

    static void main(String[] args) {
        MethodDemo ob = new MethodDemo();
        //method calling

        ob.greet();
        ob.displayinfo("Ram", 45, 100, true);
    }
    }
