package Day12;

//we cannot extend final class
//final variable must be initialized
//in java final is used to declare constant
//we cannot re-initialized
public class FinalDemo {

    final int a = 4;

    //final int x;

    //we cannot use final keyword on constructor

    // public FinalDemo(int x){
    //   this.x =x;


    //we cannot override final method
    public FinalDemo() {

    }

    //we cannot override final method.
    public void greet() {
        System.out.println("Good Morning!");
    }
}

