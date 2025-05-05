import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Task> programmer1Tasks = new ArrayList<>();
        programmer1Tasks.add(new Task(1, "Write and test code", "Planned", 1));
        programmer1Tasks.add(new Task(2, "Fix bugs", "In Progress", 4));
        programmer1Tasks.add(new Task(3, "Improve performance", "Testing", 3));
        Programmer programmer1 = new Programmer("Adam", "Augsburg", programmer1Tasks);

        List<Task> programmer2Tasks = new ArrayList<>();
        programmer2Tasks.add(new Task(1, "Improve performance", "Planned", 2));
        programmer2Tasks.add(new Task(2, "Fix bugs", "Testing", 2));
        programmer2Tasks.add(new Task(3, "Plan software features", "In Review", 10));
        Programmer programmer2 = new Programmer("Benjamin", "Bremen", programmer2Tasks);

        List<Task> programmer3Tasks = new ArrayList<>();
        programmer3Tasks.add(new Task(1, "Improve performance", "Testing", 2));
        programmer3Tasks.add(new Task(2, "Fix bugs", "In Progress", 4));
        programmer3Tasks.add(new Task(3, "Plan software features", "Done", 11));
        Programmer programmer3 = new Programmer("Celine", "Stuttgart", programmer3Tasks);

        List<Programmer> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);

        programmers.forEach(System.out::println);
        System.out.println("------ Print all tasks -----------");
        listOfAllTasks1(programmers).forEach(System.out::println);

    }

    public static List<String> listOfAllTasks(List<Programmer> list) {
        List<Task> temporary = new ArrayList<>();
        for (Programmer pr : list) {
            temporary.addAll(pr.getTasks());
        }
        List<String> result = new ArrayList<>();
        for (Task element : temporary) {
            result.add(element.getDescription());
        }
        return result;
    }

    public static List<String> listOfAllTasks1(List<Programmer> list) {
        Set<Task> temporary = new HashSet<>();
        list.forEach(programmer -> temporary.addAll(programmer.getTasks()));
        List<String> result = new ArrayList<>();
        temporary.forEach(task -> result.add(task.getDescription()));
        return result;
    }


}