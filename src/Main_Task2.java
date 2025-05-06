import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main_Task2 {
    public static void main(String[] args) {

        System.out.println("-------- Person List 1  -----------");
        List<Person> personList1 = new ArrayList<>();
        personList1.add(new Person("Alanos", "Bergos"));
        personList1.add(new Person("Alanos", "Bergos"));
        personList1.add(new Person("Barbyy", "Cimmer"));
        personList1.add(new Person("Celine", "Dionis"));
        personList1.add(new Person("Dirkos", "Einzel"));
        personList1.forEach(System.out::println);

        System.out.println("-------- Person List 2  -----------");
        List<Person> personList2 = new ArrayList<>();
        personList2.add(new Person("Alanos", "Bergos"));
        personList2.add(new Person("Oskaro", "Bigalo"));
        personList2.add(new Person("Oskaro", "Bigalo"));
        personList2.add(new Person("Adrian", "Hariss"));
        personList2.add(new Person("Klinto", "Westos"));
        personList2.forEach(System.out::println);

        System.out.println("-------- Filtered List from two lists  -----------");
        filter(personList1, personList2).forEach(System.out::println);

        System.out.println("-------- Filtered List with duplicates  -----------");
        Set<Person> result = new HashSet<>(findDuplicates(personList1));
        System.out.println(result);


    }

    public static Set<Person> filter(List<Person> list1, List<Person> list2) {
        Set<Person> set1 = new HashSet<>(list1);
        Set<Person> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        return set1;
    }

    public static Set<Person> findDuplicates(List<Person> list) {
        Set<Person> result = new HashSet<>();


        return result;
    }

}
