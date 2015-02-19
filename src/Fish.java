class Fish extends Animal {

    boolean fishPredator;

    Fish(String name,  int age, int weight, int length, boolean predator, int price) {
        super(name, age, weight, length, price);
        this.fishPredator = predator;
    }

}