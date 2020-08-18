package lec1_stream;

import java.util.Arrays;
import java.util.List;

public class Use_of_stream02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Peach", "Banana", "Plum", "Cherry", "BlueBerries");
        System.out.println("\n--------------- Iterate using for loop ----------------");
        for (int i = 0; i < list.size(); i++) {
            String fruit = list.get(i);
            if (fruit.startsWith("B")) {
                System.out.println(fruit);
            }
        }

        System.out.println("\n--------------- Iterate using for each loop ----------------");
        for (String fruit : list) {
            if (fruit.startsWith("B")) {
                System.out.println(fruit);
            }
        }

        System.out.println("\n--------------- Iterate using Stream for each loop ----------------");
        list.stream()
                .filter(fruit -> fruit.startsWith("B"))
                .forEach(fruit -> System.out.println(fruit));

    }
}
