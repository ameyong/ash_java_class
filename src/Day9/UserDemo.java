package Day9;

public class UserDemo {
    String name;
    int age;

    public UserDemo(String n, int a){
        name = n;
        age = a;
        System.out.println("Constructor Called");
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    static void main(String[] args) {
        UserDemo user1 = new UserDemo("Raju", 50);
        user1.displayInfo();

        System.out.println("===============");

        UserDemo user2 = new UserDemo("Ram", 40);
        user2.displayInfo();

        System.out.println("=============");

    }

    }



