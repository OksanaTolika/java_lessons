import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Exercise1();
        Exercise2();
    }

    public static void Exercise1() {

        System.out.println("First Exercise");
        String[] animal = new String[]{"cat", "dog", "mouse", "shrimp", "parrot", "monkey", "dog", "parrot", "parrot", "dog", "lizard", "snake", "lizard", "cat"};

        HashMap<String, Integer> countAnimal = new HashMap<>();
        for (int i = 0; i < animal.length; i++) {
            if (countAnimal.containsKey(animal[i])) {
                countAnimal.put(animal[i], countAnimal.get(animal[i]) + 1);
            } else {
                countAnimal.put(animal[i], 1);
            }
        }
        System.out.println("Уникальные слова: ");
        for (Map.Entry<String, Integer> o : countAnimal.entrySet()) {
            if (o.getValue() == 1) {
                System.out.println(o.getKey());
            }
        }
        System.out.println("\nCколько раз встречается каждое слово");
        for (Map.Entry<String, Integer> o : countAnimal.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        System.out.println();
    }

    public static void Exercise2() {
        System.out.println("Second Exercise");
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.Add("Ivanov", "89998887766");
        telephoneDirectory.Add("Petrov", "89994447766");
        telephoneDirectory.Add("Ivanov", "89993337766");
        telephoneDirectory.Add("Petrov", "89998887711");
        telephoneDirectory.Add("Sidorov", "89993331166");
        telephoneDirectory.Add("Smirnov", "89992227711");

        System.out.println("Ivanov: " + telephoneDirectory.Get("Ivanov"));
        System.out.println("Petrov: " + telephoneDirectory.Get("Petrov"));
        System.out.println("Sidorov: " + telephoneDirectory.Get("Sidorov"));
        System.out.println("Smirnov: " + telephoneDirectory.Get("Smirnov"));
    }
}
