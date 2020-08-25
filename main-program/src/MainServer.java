import InsertionSort.InsertionSort;

public class MainServer {
    public static void main(String[] args) {
        System.out.println("Program is started.");

        int[] list = { 15, 2, 3, 20, 9, 6, 1, 16 };

        System.out.println("This program will sort following list");
        for (int val : list) {
            System.out.print(val + ", ");
        }
        System.out.println();
        System.out.println("sorting...");
        InsertionSort.sort(list);

        System.out.println("List is sorted: ");

        for (int val : list) {
            System.out.print(val + ", ");
        }


        System.out.println();
        System.out.println("Program finished.");
    }
}
