package works.mrr.gli.pojo;

public class Cat extends Animal {
    public Cat() {
        super(true, true);
    }

    @Override
    public void animalSound() {
        System.out.println("Meow...");
    }
}
