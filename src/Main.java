import java.util.*;

public class Main {

    public static void main(String[] args) {
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
            // При наличии дубликата, увеличиваем его счетчик на 1
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //Задание 2

        TelephoneDic phoneBook2 = new TelephoneDic();

        phoneBook2.add("Баранов", "8 (900) 234-56-78");
        phoneBook2.add("Васильева", "8 (900) 345-67-89");
        phoneBook2.add("Григорьев", " 8 (900) 456-78-90");
        phoneBook2.add("Дмитриева", " 8 (900) 567-89-01");
        phoneBook2.add("Жуков", " 8 (900) 759-01-23");
        phoneBook2.add("Жуков", " 8 (900) 789-08-23");
        phoneBook2.add("Зайцева", " 8 (900) 890-12-34");
        phoneBook2.add("Смирнова", " 8 (900) 799-01-99");
        phoneBook2.add("Смирнова", " 8 (900) 789-01-23");

        System.out.println("Телефоны Васильева: " + phoneBook2.get("Васильева"));
        System.out.println("Телефоны Жукова: " + phoneBook2.get("Жуков"));

    }
}
