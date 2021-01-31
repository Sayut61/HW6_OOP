package Task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(113);
        arrayList.add(12);
        arrayList.add(43);
        arrayList.add(5);
        arrayList.add(21);

        ListIterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next()+1);
        }
        


    }
}
