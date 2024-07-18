package works.mrr.gli.pojo;

public class Animal {
    private boolean isMammal;
    private boolean isCarnivore;

    public Animal() {}

    public Animal(boolean isMammal, boolean isCarnivore) {
        this.isMammal = isMammal;
        this.isCarnivore = isCarnivore;
    }

    public void animalSound() {
        System.out.println("Please Override This Function");
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void setCarnivore(boolean carnivore) {
        isCarnivore = carnivore;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}
