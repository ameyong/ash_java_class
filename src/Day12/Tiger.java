package Day12;

public class Tiger extends Demo implements Animal, WildAnimal {
    @Override
    public void makeSound() {
        System.out.println("Tiger roars!!");
    }

    public void roam(){
        System.out.println("Tiger roams in jungle");
    }
    }
