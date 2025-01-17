import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String[] validArray = {
                "бревно",
                "камера",
                "сова",
                "дискета",
                "лампочка",
                "акула",
                "крона",
                "подоконник",
                "камера",
                "фонтан",
                "гирлянда",
                "пчела",
                "плоскогубцы",
                "лампочка",
                "громоотвод",
                "камера",
                "санки",
                "камера",
                "акула",
                "капюшон"
        };
        Set<String> mySet = new HashSet<>(); //Метод выводит уникальные слова из массива
        for (String x : validArray) {
            mySet.add(x);
        }
        System.out.println("Уникальные слова: " + mySet.toString());

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : validArray) {
            // Если слово уже встречалось, увеличиваем его счетчик на 1
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Выводим результаты
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    }
