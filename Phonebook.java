import java.util.*;

public class Phonebook {

    private HashMap<String, List<String>> book;

    public Phonebook(){
        this.book = new HashMap<>();
    }

    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        } else {
            System.out.println(String.format("There is no record for this surname %s", surname));
            return new ArrayList<>();
        }
    }

    public void add(String surname, String number){
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
             if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Number %s add to surname %s", number, surname));
            } else {
                System.out.println(String.format("Number %s exists for surname %s", number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Number %s add to surname %s", number, surname));
        }
    }
}
