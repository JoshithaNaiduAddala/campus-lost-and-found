
public class Item {
    private String name;
    private String location;
    private String description;
    private String status;

    public Item(String name, String location, String description, String status) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void markAsClaimed() {
        status = "Claimed";
    }

    public void displayItem() {
        System.out.println("Item: " + name);
        System.out.println("Location: " + location);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
    }
}

