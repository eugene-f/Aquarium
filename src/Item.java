class Item {

    private String itemName;
    private int itemPrice;

    Item(String name, int price) {
        this.itemName = name;
        this.itemPrice = price;
        Aquarium.listItems.add(this);
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

}