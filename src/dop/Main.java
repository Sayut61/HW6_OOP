package dop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Teacher> arrayList = new ArrayList<>();
        Teacher t1 = new Teacher("Светлана");
        Teacher t2 = new Teacher("Алексей");
        Teacher t3 = new Teacher("Ирина");
        Teacher t4 = new Teacher("Виктория");
        arrayList.add(t1);
        arrayList.add(t2);
        arrayList.add(t3);
        arrayList.add(t4);

        System.out.println("Индекс лучшего: ");
        System.out.println(arrayList.indexOf(t2));
        System.out.println("Индекс худшего: ");
        System.out.println(arrayList.indexOf(t4));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getName());
        }

    }
}
