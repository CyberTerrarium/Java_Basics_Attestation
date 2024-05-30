package java_and_basic_api;

public class Program {

    public static void main(String[] args) {
        Phonebook pb = new Phonebook();
        pb.addRecord(new User("alex", "alexov"), 79001010101L);
        pb.addRecord(new User("boris", "borisov"), 79031010707L);
        pb.addRecord(new User("ivan", "ivanov"), 79991010909L);
        pb.addRecord(new User("ivan", "ivanov"), 70004040404L);

        pb.printAll();
        System.out.println();

        pb.addRecord(new User("boris", "borisov"), 79031010708L);
        pb.addRecord(new User("boris", "borisov"), 79031010709L);

        pb.printAll();
        System.out.println();

        pb.addRecord(new User("petrovi4"), 81486518L);
        pb.addRecord(new User("petrovi4"), 12345L);

        pb.printAll();
        System.out.println();

        pb.deleteNumber(321L);
        pb.deleteNumber(12345L);

        pb.printAll();
        System.out.println();

        pb.deleteRecord(new User("petrovi4"));

        pb.printAll();
        System.out.println();
    }
}
