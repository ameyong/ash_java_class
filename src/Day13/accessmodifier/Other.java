package Day13.accessmodifier;

public class Other {
    static void main(String[] args) {
            AccessModifierDemo demo = new AccessModifierDemo(5, "Hello");
            demo.publicMethod();
            demo.protectedMethod();
            demo.defaultMethod();
            // demo.privateMethod();
        }
    }
