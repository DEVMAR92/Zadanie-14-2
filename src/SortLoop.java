import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class SortLoop {

    public LinkedList<Person> start(LinkedList<Person> parameter) {

        LinkedList<Person> persons = (LinkedList<Person>) parameter.clone();
        ;

        FirstNameAscComparator firstNameAscComparator = new FirstNameAscComparator();
        FirstNameDescComparator firstNameDescComparator = new FirstNameDescComparator();

        LastNameAscComparator lastNameAscComparator = new LastNameAscComparator();
        LastNameDescComparator lastNameDescComparator = new LastNameDescComparator();

        System.out.println("Witaj w programie!\nDane przed sortowaniem");
        System.out.println(persons);
        System.out.println("Wybierz metodę sortowania:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("imie lub nazwisko");

        String result = scanner.nextLine();

        if (result.equals("imie")) {
            System.out.println("rosnaco czy malejaco?");
            String name = scanner.nextLine();
            if (name.equals("rosnaco")) {
                Collections.sort(persons, firstNameAscComparator);
                System.out.println(persons);
                return persons;
            } else if (name.equals("malejaco")) {
                Collections.sort(persons, firstNameDescComparator);
                System.out.println(persons);
                return persons;
            } else {
                System.out.println("Błąd danych");
            }

        } else if (result.equals("nazwisko")) {
            System.out.println("rosnaco czy malejaco?");
            String name = scanner.nextLine();
            if (name.equals("rosnaco")) {
                Collections.sort(persons, lastNameAscComparator);
                System.out.println(persons);
                return persons;
            } else if (name.equals("malejaco")) {
                Collections.sort(persons, lastNameDescComparator);
                System.out.println(persons);
                return persons;
            } else {
                System.out.println("Błąd danych");
            }
        } else {
            System.out.println("Niepoprawne dane");
            return null;
        }

        return null;


    }
}
