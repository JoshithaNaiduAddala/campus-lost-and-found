
public class FoundItem extends Item {

    public FoundItem(String name, String location, String description) {
        super(name, location, description, "Found");
    }

    @Override
    public void displayItem() {
        System.out.println("Type: Found Item");
        super.displayItem();
    }
}
