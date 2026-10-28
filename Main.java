import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        int nextId = 101;
        int choice;

        do {
            System.out.println("\n===== CAMPUS LOST & FOUND =====");
            System.out.println("1. Report a lost item");
            System.out.println("2. Report a found item");
            System.out.println("3. View all items");
            System.out.println("4. Search for an item");
            System.out.println("5. Mark item as claimed");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1 || choice == 2) {
                System.out.print("Enter item name: ");
                String name = sc.nextLine();

                System.out.print("Enter location: ");
                String location = sc.nextLine();

                System.out.print("Enter description: ");
String description = sc.nextLine();

Item item;

System.out.print("Enter contact number: ");
String phone = sc.nextLine();

if (choice == 1) {
    item = new LostItem(nextId, name, location, description, phone);
} else {
    item = new FoundItem(nextId, name, location, description, phone);
}

items.add(item);
                nextId++;

                System.out.println("Item reported successfully!");
                System.out.println("Your item ID is: " + item.getId());


                System.out.println("Item reported successfully!");

            } else if (choice == 3) {
                if (items.isEmpty()) {
                    System.out.println("No items reported yet.");
                } else {
                    for (Item item : items) {
                        item.displayItem();
                        System.out.println("--------------------");
                    }
                }

            } else if (choice == 4) {
                System.out.print("Enter item name to search: ");
                String searchName = sc.nextLine();
                boolean found = false;

                for (Item item : items) {
                    if (item.getName().equalsIgnoreCase(searchName)) {
                        item.displayItem();
                        found = true;
                    }
                }

                if (!found) {
    System.out.println("Item not found.");
}
        } else if (choice == 5) {
            System.out.print("Enter item ID to claim: ");
            int id = sc.nextInt();
            sc.nextLine();

            boolean itemFound = false;

            for (Item item : items) {
                if (item.getId() == id &&
                    item.getStatus().equals("Found")) {
                    item.markAsClaimed();
                    System.out.println("Item claimed successfully!");
                    item.displayItem();
                    itemFound = true;
                    break;
                }
            }

            if (!itemFound) {
                System.out.println("No matching found item exists with that ID.");
            }

        } else if (choice != 6) {
            System.out.println("Invalid choice. Try again.");
        }

    } while (choice != 6);

        System.out.println("Thank you for using Campus Lost & Found!");
        sc.close();
    }
}
