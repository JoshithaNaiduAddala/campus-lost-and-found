
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
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

                String status = (choice == 1) ? "Lost" : "Found";
                Item item = new Item(name, location, description, status);
                items.add(item);

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
                System.out.print("Enter item name to mark as claimed: ");
                String claimName = sc.nextLine();
                boolean found = false;

                for (Item item : items) {
                    if (item.getName().equalsIgnoreCase(claimName)) {
                        item.markAsClaimed();
                        System.out.println("Item marked as claimed!");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Item not found.");
                }

            } else if (choice != 6) {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        System.out.println("Thank you for using Campus Lost & Found!");
        sc.close();
    }
}
