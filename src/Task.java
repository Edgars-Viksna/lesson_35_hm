import java.util.Objects;

public class Task {
    private int number;
    private String description;
    private String status;
    private int daysInProcessing;

    public Task(int number, String description, String status, int daysInProcessing) {
        this.number = number;
        this.description = description;
        this.status = status;
        this.daysInProcessing = daysInProcessing;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task number: " + number +
                ",    description: " + description +
                ",    status: " + status +
                ",    days in processing: " + daysInProcessing + System.lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }
}
