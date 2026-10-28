
public class Item {
    private int id;
    private String name;
    private String location;
    private String description;
    private String status;
    private String phone;

    public Item(int id, String name, String location, String description, String status, String phone) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.status = status;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getPhone() {
        return phone;
    }

    public void markAsClaimed() {
        status = "Claimed";
    }

    public void displayItem() {
        System.out.println("ID: " + id);
        System.out.println("Item: " + name);
        System.out.println("Location: " + location);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Contact: " + phone);
    }
}