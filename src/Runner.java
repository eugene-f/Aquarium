public class Runner {

    public static void main(String[] args) {
        createItems();
        printData();
    }

    private static void createItems() {
        new Aquarium(30, 5640);
        new Fish("Bob", 3, 15, 11, true, 1350);
        new Reptile("Jack", 2, 32, 16, 1600);
        new Fish("Lucky", 1, 8, 7, false, 940);
        new Reptile("Grom", 1, 5, 14, 1480);
        new Accessory("Recycler", 760);
        new Accessory("Filter", 980);
        new Accessory("Generator", 1240);
    }

    private static void printData() {

        System.out.println("You get " + Aquarium.listItems.size() + " items:\n");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - \n");

        for (Item item : Aquarium.listItems) {
            System.out.println("Type:    " + item.getClass().getName());
            System.out.println("Name:    " + item.getItemName());
            System.out.println("Price:   " + item.getItemPrice() + "$");
            System.out.println();
        }

        System.out.println("==================================================\n");
        System.out.println("Total price: " + Aquarium.calculateTotalPrice() + "$");
    }

}