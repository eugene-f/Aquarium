import java.util.ArrayList;

class Aquarium extends Item {

    static ArrayList<Item> listItems = new ArrayList<Item>();

    int volume;

    Aquarium(int volume, int price) {
        super("Aquarium", price);
        this.volume = volume;
    }

    public static int calculateTotalPrice() {
        int total = 0;

        for(Item item : listItems) {
            total += item.getItemPrice();
        }

        return total;
    }

}