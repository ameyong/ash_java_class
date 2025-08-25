package Day8;

public class NonStaticStaticTest {
    static void main(String[] args) {
        NonStaticStaticDemo ob = new NonStaticStaticDemo();
        System.out.println(ob.a);
        ob.sayHello();

        System.out.println(NonStaticStaticDemo.b);
        NonStaticStaticDemo.sayHi();
    }

}
