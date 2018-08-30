import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Person> persons = new LinkedList();

        persons.add(new Person("Andrzej", "Bednarek"));
        persons.add(new Person("Jakub", "Bednarek"));
        persons.add(new Person("Tadeusz", "Kowal"));
        persons.add(new Person("Andrzej", "Zawadzki"));

        SortLoop sortLoop = new SortLoop();

        LinkedList<Person> sortPersons = sortLoop.start(persons);

        System.out.println(sortPersons);
    }
}
