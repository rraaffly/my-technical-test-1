package works.mrr.gli.pojo;

public class Cow extends Animal {
    public Cow() {
        super(true, false);
    }

    @Override
    public void animalSound() {
        System.out.println("Moooo...");
    }
}
