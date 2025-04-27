public class Main {
    public static void main(String[] args) {
        UnaList<Integer> myList = new UnaList<>();

        // Insert at beginning
        System.out.println("// Insert at beginning");
        for (int i = 0; i < 5; i++) {
            myList.insertAtBeginning(i + 1);
            System.out.println(myList);
        }

        System.out.println();

        // Remove at beginning
        System.out.println("// Remove at beginning");
        System.out.println(myList);
        myList.removeAtBeginning();
        System.out.println(myList);

        System.out.println();
        
        // Insert at end
        System.out.println("// Insert at end");
        for (int i = 1; i > -5; i--) {
            myList.insertAtEnd(i - 1);
            System.out.println(myList);
        }

        System.out.println();

        // Remove at end
        System.out.println("// Remove at end");
        System.out.println(myList);
        myList.removeAtEnd();
        System.out.println(myList);
        
        System.out.println();

        // Search item
        System.out.println("// Search item");
        System.out.println(myList);
        System.out.println(myList.searchItem(1));

        System.out.println();

        // Remove item by value
        System.out.println("// Remove item by value");
        System.out.println(myList);
        myList.removeItemByValue(1);
        System.out.println(myList);

        System.out.println();

        // Insert item after i-th item
        System.out.println("// Insert item after ith item");
        System.out.println(myList);
        myList.insertValueAfterIndex(3, 3);
        System.out.println(myList);

        System.out.println();

        // Remove i-th item
        System.out.println("// Insert item after i-th item");
        System.out.println(myList);
        myList.removeItemFromIndex(6);
        System.out.println(myList);

        System.out.println();

        // List size
        System.out.println("// List size");
        System.out.println(myList);
        int listSize = myList.listSize();
        System.out.println("myList size is: " + listSize + " elements.");

        System.out.println();

        // Change element value
        System.out.println("// Change element value");
        System.out.println(myList);
        myList.changeElementValue(5, 9);
        System.out.println(myList);
    }
}