package Day9;

public class User {
    //non static (instance) variable, properties, member's data, data, fields, attributes
    String name;
    int age;
    public void assignUserinfo(String n, int a) {
        name = n;
        age = a;
    }
    public void displayInfo(){
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }

    static void main(String[] args) {
        User user1 = new User();
        //user1.name = "Ash"; // direct storing data is not good.
        //user1.age = 20;
        user1.assignUserinfo("Ash", 10);
        user1.displayInfo();

       //System.out.println(user1.name);
        //System.out.println(user1.age);

        System.out.println("==========");

        User user2 = new User();
        user2.assignUserinfo("Ram", 35);
        user2.displayInfo();


    }
    //constructor: special number functions which has the following characteristics.
    // name is same as class name
    //has no return type
    //cannot use void keyword
    //can use any access modifier
    //use to initialize members data
    //runs only once for each object
}

