import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("\n" + "Your To Do List");
            System.out.print("Choose an option: " + "\n");
            System.out.println("\n" + "1. View Item(s)");
            System.out.println("2. Add Item");
            System.out.println("3. Delete Item");
            System.out.println("4. Exit to do list");
            userInput = input.nextInt();

            switch (userInput) {
                case 1:
                    if(items.isEmpty()) {
                        System.out.println("The To Do list is empty.");
                }else {
                        System.out.println("Your current To Do List:");
                        for (int i = 0; i < items.size(); i++) {
                            System.out.println((i + 1) + ". " + items.get(i));
                        }
                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Item to be added: ");
                    String addItem = input.nextLine();
                    items.add(addItem);
                    System.out.println("Item " + " ' " + addItem + " ' " + " has been added.");
                    break;

                case 3:
                    System.out.print("Enter the index of item to be deleted: ");
                    int itemIndex = input.nextInt();
                    input.nextLine();

                    if (itemIndex >= 0 && itemIndex < items.size()) {
                        String item = items.get(itemIndex);
                        items.remove(itemIndex);
                        System.out.println("Item " + " ' " + item + " ' " + " has been deleted.");
                    } else {
                        System.out.println("Index does not exist.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the to do list");
                    break;
            }
        } while (userInput != 4);

        input.close();
    }
}