public class Main {
    public static void main(String[] args){

        Phonebook phonebook = new Phonebook();
        phonebook.add("Petrov", "375297505050");
        phonebook.add("Ivanov", "375297505051");
        phonebook.add("Sidorov", "375297505052");
        phonebook.add("Dadonov", "375297505053");
        phonebook.add("Ivanov", "375297505054");

        System.out.println("Getting the numbers");
        System.out.println("Petrov");
        System.out.println(phonebook.get("Petrov"));
        System.out.println("Ivanov");
        System.out.println(phonebook.get("Ivanov"));
        System.out.println("Sokolov");
        System.out.println(phonebook.get("Sokolov"));

        System.out.println("No records");
        System.out.println("Izmailov");
        System.out.println(phonebook.get("Izmailov"));

        System.out.println("Add new number");
        phonebook.add("Danilov", "375297505055");
    }
}