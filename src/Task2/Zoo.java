package Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0,"рыба");
        arrayList.add(1,"овца");
        arrayList.add(2,"конь");
        arrayList.add(3,"олень");
        arrayList.add(4,"собака");
        arrayList.add(5,"кошка");
        arrayList.add(6,"воробей");
        arrayList.add(7,"бык");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }


}
