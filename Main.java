import java.util.LinkedList;
import java.util.ArrayList;

public class Main {


    public static void bubbleSortLinkedList(LinkedList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (list.get(j) > list.get(j+1)) {

                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }


    public static void bubbleSortArrayList(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (list.get(j) > list.get(j+1)) {

                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(1);
        linkedList.add(3);

        System.out.println("LinkedList до сортировки: " + linkedList);
        bubbleSortLinkedList(linkedList);
        System.out.println("LinkedList после сортировки: " + linkedList);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(3);

        System.out.println("ArrayList до сортировки: " + arrayList);
        bubbleSortArrayList(arrayList);
        System.out.println("ArrayList после сортировки: " + arrayList);
    }
}
