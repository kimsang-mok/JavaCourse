public class Dog extends Animal {
    private String earShape;
    private String tailShape;
    public Dog() {
        super("German Shepherd", "small", 10.9);
    }
    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape  = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        if (type.equals("Wolf")) {
            System.out.println("Owwllllll");
        } else {
            bark();
        }
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed.equals("slow")) {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
    }

    private void bark() {
        System.out.println("Woof");
    }
    private void run() {
        System.out.print("Dog is running.");
    }
    private void walk() {
        System.out.println("Dog is walking.");
    }
    private void wagTail() {
        System.out.println("Tail is wagging.");
    }
}
