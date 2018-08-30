import java.util.Comparator;

public class FirstNameDescComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
       return o2.getFirstName().compareTo(o1.getFirstName());
    }
}
