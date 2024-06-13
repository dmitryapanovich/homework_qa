import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Apple", "Banana", "Melon",
                "Apple", "Lemon", "Orange",
                "Apple", "Banana", "Watermelon",
                "Apple", "Lime", "Orange",
                "Apple", "Banana", "Grapes",
                "Apple", "Pineapple", "Orange"};

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
            System.out.println("Unique words (= number of repeats): " + hm);
    }
}