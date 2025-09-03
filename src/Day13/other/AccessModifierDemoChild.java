package Day13.other;

import Day13.accessmodifier.AccessModifierDemo;

public class AccessModifierDemoChild extends AccessModifierDemo {
    static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo();
        demo.publicMethod();
        //demo.protectedMethod();
        //demo.defaultMethod();
        //demo.privateMethod();

        AccessModifierDemoChild child = new AccessModifierDemoChild();
        child.protectedMethod();
    }
}