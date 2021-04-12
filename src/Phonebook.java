import java.util.*;

public class Phonebook {
    private static Map<String, List<String>> contacts = new HashMap<>();
    private static List<String> phoneNumber;

    public static void addContact(String surname, String phone_number) {
        if (contacts.containsKey(surname)) {
            phoneNumber = contacts.get(surname);
            phoneNumber.add(phone_number);
            contacts.put(surname, phoneNumber);
        } else {
            phoneNumber = new ArrayList<>();
            phoneNumber.add(phone_number);
            contacts.put(surname, phoneNumber);
        }
    }

    public static void get(String surname) {
        if (contacts.containsKey(surname)) {
                System.out.println("Фамилия : " + surname + ", Номер телефона: " + contacts.get(surname));
            }else {
            System.out.println(surname + ": " + " контакта с такой фамилией нет");
            }
        }
    }






