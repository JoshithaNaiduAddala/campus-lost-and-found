
public class LostItem extends Item {

    public LostItem(String name, String location, String description) {
        super(name, location, description, "Lost");
    }

    @Override
    public void displayItem() {
        System.out.println("Type: Lost Item");
        super.displayItem();
    }
}
