
public class LostItem extends Item {

    public LostItem(int id, String name, String location, String description, String phone) {
        super(id, name, location, description, "Lost", phone);
    }

    @Override
    public void displayItem() {
        System.out.println("Type: Lost Item");
        super.displayItem();
    }
}