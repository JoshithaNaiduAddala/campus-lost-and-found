
public class FoundItem extends Item {

    public FoundItem(int id, String name, String location, String description, String phone) {
        super(id, name, location, description, "Found", phone);
    }

    @Override
    public void displayItem() {
        System.out.println("Type: Found Item");
        super.displayItem();
    }
}