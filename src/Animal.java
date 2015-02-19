class Animal extends Item {

    int animalAge;
    int animalWeight;
    int animalLength;

    Animal(String name,  int age, int weight, int length, int price) {
        super(name, price);
        this.animalAge = age;
        this.animalWeight = weight;
        this.animalLength = length;
    }

}