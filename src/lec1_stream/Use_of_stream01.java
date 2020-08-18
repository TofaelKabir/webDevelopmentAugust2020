package lec1_stream;

import java.util.Arrays;
import java.util.List;

public class Use_of_stream01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Peach", "Banana", "Plum", "Cherry", "BlueBerries");
        System.out.println("\n--------------- Iterate using for loop ----------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\n--------------- Iterate using for each loop ----------------");
        for (String fruit : list) {
                System.out.println(fruit);
        }

        System.out.println("\n--------------- Iterate using Stream for each loop ----------------");
        list.stream()
                .forEach(fruit -> System.out.println(fruit));

    }
}
