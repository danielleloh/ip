package task;

/**
 * This class represents a to-do task.
 */
public class Todo extends Task {
    public Todo(String description, boolean completed) {
        super(description, completed);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
