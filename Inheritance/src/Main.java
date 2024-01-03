public class Main {
    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog retriever = new Dog("Retriever", 22.2);
        doAnimalStuff(retriever, "slow");
        Dog shepherd = new Dog("German Shepherd", 24.2);
        doAnimalStuff(shepherd, "fast");

        Dog wolf = new Dog("Wolf", 30.2);
        doAnimalStuff(wolf, "fast");

        Fish goldie = new Fish("GoldFish", 0.25, 2, 3) ;
        doAnimalStuff(goldie, "fast");
    }
}