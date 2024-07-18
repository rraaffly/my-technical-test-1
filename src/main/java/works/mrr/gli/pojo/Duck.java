package works.mrr.gli.pojo;

public class Duck extends Animal {
    public Duck() {
        super(false, false);
    }

    @Override
    public void animalSound() {
        System.out.println("Quack...");
    }
}
