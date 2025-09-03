package Day13.accessmodifier;

public class AccessModifierDemoChild extends AccessModifierDemo {
    static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo(5, "Hello");
        demo.publicMethod();
        demo.protectedMethod();
        demo.defaultMethod();
        // demo.privateMethod();
    }
}