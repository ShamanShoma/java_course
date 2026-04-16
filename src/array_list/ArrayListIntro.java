package array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {
    static void main() {

        List<String> fruits = new ArrayList<>();

        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        System.out.println("Первый фрукт: " + fruits.get(0));

        fruits.set(1, "Груша");

        fruits.remove("Апельсин");

        System.out.println("Список фруктов: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Количество: " + fruits.size());

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Элемент " + i + ": " + fruits.get(i));
        }
    }
}
