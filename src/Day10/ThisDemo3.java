package Day10;

public class ThisDemo3 {
    public void sayHello() {
        System.out.println("Hello");
    }
    public void greet(){
        this.sayHello();
        System.out.println("Good Morning");
    }

    static void main(String[] args) {
        ThisDemo3 obj = new ThisDemo3();
        obj.greet();

    }
}
