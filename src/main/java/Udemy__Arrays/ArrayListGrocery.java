package Udemy__Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGrocery {

    public static void main(String[] args) {

    }

    private ArrayList<String> groceryList = new ArrayList();

    public void addGroceryList(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("you have = " + groceryList.size() + " Items remaining on your shopping List");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0 ){
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {

        groceryList.set(position, newItem);

        System.out.println("Grocery item " + (position + 1) + " has been  modified ");

    }
public void removeGroceryItem(String item){
    int position = findItem(item);
    if (position >= 0 ){
        removeGroceryItem(position);
    }
}
    private void removeGroceryItem(int index) {
        String theItem = groceryList.get(index);
        groceryList.remove(index);
    }

    private int findItem(String searchItem) {
//        boolean exist = groceryList.contains(searchItem);

        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0 ){
            return true;
        }else {
            return false;
        }
    }

    public static class MainArrayList {


        private static Scanner scanner = new Scanner(System.in);
        private static ArrayListGrocery groceryList = new ArrayListGrocery();







        public static void main(String[] args) {

            boolean quit = false;
            int choice = 0;

            printInstructions();

            while (!quit){
                System.out.println("Enter your choice ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 0 :
                        printInstructions();
                        break;
                    case 1 :
                        groceryList.printGroceryList();
                        break;
                    case 2 :
                        addItem();
                        break;
                    case 3 :
                        modifyItem();
                        break;
                    case 4:
                        removeItem();
                        break;
                    case 5 :
                        searchItem();
                        break;
                    case 6:
                        quit = true;
                        break;
                    case 7:
                        printArrayList();
                        break;
                }
            }

        }
            public static void printInstructions(){
                System.out.println("\nPress ");
                System.out.println("\t 0 - To print choice option.");
                System.out.println("\t 1 - To print the list of Grocery items.");
                System.out.println("\t 2 - To add an item to the list.");
                System.out.println("\t 3 - To modify an item in the list.");
                System.out.println("\t 4 - To remove an item from the list.");
                System.out.println("\t 5 - To search for an item in the list.");
                System.out.println("\t 6 - To quit the application.");
            }
            public static void addItem() {
                System.out.println("Please enter the grocery item: ");
                String addedItems = scanner.nextLine();
                groceryList.addGroceryList(addedItems);
            }

            public static void modifyItem(){
                System.out.println("Enter Current Item name: ");
                String itemName = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Enter item to be Replaced ");
                String newItem = scanner.nextLine();
                groceryList.modifyGroceryItem(itemName, newItem);
            }

            public static void removeItem(){
                System.out.println("Please Enter Item name: ");
                String itemName = scanner.nextLine();
                scanner.nextLine();
                groceryList.removeGroceryItem(itemName);
            }
            public static void searchItem(){
                System.out.println("Enter item to search for: ");
                String searchedItem = scanner.nextLine();
                if (groceryList.onFile(searchedItem)){
                    System.out.println("Found " + searchedItem + "in our grocery list");

                }else {
                    System.out.println(searchedItem + " not found!");
                }
            }
            public static void printArrayList(){
            ArrayList<String> list = new ArrayList<>(groceryList.getGroceryList());

            String[] arrayList = new String[groceryList.getGroceryList().size()];
            arrayList = groceryList.getGroceryList().toArray(arrayList);
            }
    }
}