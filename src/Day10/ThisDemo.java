package Day10;

//shodowing is the process of hiding instance variable by local variable with same name
//in non-static method
//this is a keyword and is an implicit reference variable of current object of a current class
//and constructor of a class
//we cannot change the value of class

public class ThisDemo {
    //instance variable
    int a = 5;

    public void display(){
        System.out.println("this is: " + this);
        System.out.println(a);
        //local variable
        int a = 6;
        System.out.println(a);
        //ThisDemo obj = new ThisDemo();
        int sum = a + this.a;
        System.out.println("sum = " + sum);
    }


    static void greet() {
        ThisDemo obj = new ThisDemo();
        System.out.println(obj.a);
        int a = 7;
    }

    static void main(String[] args) {
        ThisDemo obj1 = new ThisDemo();
        System.out.println("obj1 = " + obj1);
        obj1.display();

        ThisDemo obj2 = new ThisDemo();
        System.out.println("obj2 " + obj2);
        obj2.display();
    }
}
