package dsa.hashmaps;

import java.util.ArrayList;

public class GroceryListManager {

    public static void main(String[] args) {
        // Create a new ArrayList of Strings
        ArrayList<String> groceryList = new ArrayList<>();

        // Add at least 5 different grocery items to the list
        groceryList.add("Milk");
        groceryList.add("Bread");
        groceryList.add("Eggs");
        groceryList.add("Apples");
        groceryList.add("Chicken");

        System.out.println("--- Initial Grocery List ---");
        System.out.println(groceryList);
        System.out.println("--------------------------");

        // Modify the third item in the list (index 2)
        // Let's change "Eggs" to "Yogurt"
        groceryList.set(2, "Yogurt");
        System.out.println("\n--- List after modifying the third item ---");
        System.out.println(groceryList);
        System.out.println("-------------------------------------------");

        // Remove the last item from the list
        // The last item's index will be list.size() - 1
        int lastIndex = groceryList.size() - 1;
        groceryList.remove(lastIndex);
        System.out.println("\n--- List after removing the last item ---");
        System.out.println(groceryList);
        System.out.println("-----------------------------------------");

        // Print the final size of the list
        System.out.println("\nFinal size of the list: " + groceryList.size());
        // Expected size: 4
    }
}