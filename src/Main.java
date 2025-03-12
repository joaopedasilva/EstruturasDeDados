public class Main {
    public static void main(String[] args) {
        UnaList<Integer> myList = new UnaList<>();

        for (int i = 0; i < 5; i++) {
            myList.insertAtBeginning(i + 1);
            System.out.println(myList);
        }

        System.out.println();
        System.out.println(myList);
        myList.removeAtBeginning();
        System.out.println(myList);
        System.out.println();
        
        for (int i = 1; i > -5; i--) {
            myList.insertAtEnd(i - 1);
            System.out.println(myList);
        }

        System.out.println();
        System.out.println(myList);
        myList.removeAtEnd();
        System.out.println(myList);
        System.out.println();
    }
}