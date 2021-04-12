import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("скрипка", "пианино", "гитара", "скрипка", "саксафон", "барабаны", "волынка", "труба", "пианино", "контрабас", "пианино", "саксафон"));
        Set<String> unique = new LinkedHashSet<>(words);
        System.out.println(unique);
        HashMap<String, Integer> duplicates = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            String repeat = words.get(i);
            if (!duplicates.containsKey(repeat)) {
                duplicates.put(repeat, 1);
            } else {
                duplicates.put(repeat, duplicates.get(repeat) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : duplicates.entrySet()) {
            System.out.println("Слово = " + entry.getKey() + ", Повторений = " + entry.getValue());
        }
      Phonebook phonebook = new Phonebook();
        Phonebook.addContact("Смирнов", "89999578837");
        Phonebook.addContact("Иванов", "89522552725");
        Phonebook.addContact("Смирнов", "89217563120");
        Phonebook.addContact("Беглов", "89115152613");
        Phonebook.addContact("Волков", "89215885223");
        Phonebook.addContact("Морозов", "8999811315");

        Phonebook.get("Иванов");
        Phonebook.get("Смирнов");
    }

}




