import java.util.ArrayList;

class Aquarium extends Item {

    static ArrayList<Item> listItems = new ArrayList<Item>();

    int volume;

    Aquarium(int volume, int price) {
        super("Aquarium", price);
        this.volume = volume;
    }

}