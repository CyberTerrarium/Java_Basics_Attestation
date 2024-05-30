package java_and_basic_api;

import java.util.*;

public class Phonebook {
    private HashMap<User, LinkedList<Long>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void addRecord(User user, Long phoneNumber) {
        boolean isAdded = false;
        for (User key : phonebook.keySet()) {
            if(key.equals(user)) {
                phonebook.get(user).add(phoneNumber);
                isAdded = true;
            }
        }
        if(!isAdded) {
            phonebook.put(user, new LinkedList<>());
            phonebook.get(user).add(phoneNumber);
        }

    }

    public void deleteRecord(User user) {
        boolean isDeleted = false;
        for (User key : phonebook.keySet()) {
            if (key.equals(user)) {
                phonebook.remove(user);
                isDeleted = true;
            }
        }
        if(isDeleted) System.out.println("Пользователь " + user + " был успешно удален\n");
        else System.out.println("Пользователь " + user + " не найден\n");
    }

    public void deleteNumber(long phoneNumber) {
        boolean isDeleted = false;
        for (LinkedList<Long> numbers : phonebook.values()) {
            for (Long number : numbers) {
                if (number == phoneNumber) {
                    numbers.remove(number);
                    isDeleted = true;
                }
            }
        }
        if (isDeleted) System.out.println("Номер " + phoneNumber + " удален\n");
        else System.out.println("Номер " + phoneNumber + " не найден\n");
    }


    public void printAll() {
        if (!phonebook.isEmpty()) {
            LinkedList<User> printedUsers = new LinkedList<>();

            for (int i = 0; i < phonebook.size(); i++) {
                int maxSize = -1;
                User maxUser = null;
                for (User user : phonebook.keySet()) {

                    if ((phonebook.get(user).size() > maxSize) && (!printedUsers.contains(user))) {
                        maxSize = phonebook.get(user).size();
                        maxUser = user;
                    }
                }
                System.out.println(maxUser.toString() + ':' + phonebook.get(maxUser));
                printedUsers.add(maxUser);
            }
        } else System.out.println("Телефонная книга пуста\n");
    }
}
