import java.util.Objects;

public class Person {

    private String fName;
    private String lName;

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return
                "First Name: " + fName +
                        "    Last Name: " + lName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fName, person.fName) && Objects.equals(lName, person.lName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName);
    }
}
