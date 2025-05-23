import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    private String description;
    private int urgency;

    public Task(String description, int urgency) {
        this.description = description;
        this.urgency = urgency;
    }

    public String getDescription() {
        return description;
    }

    public int getUrgency() {
        return urgency;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(other.urgency, this.urgency);
    }

    @Override
    public String toString() {
        return "Task: " + description + ", Urgency: " + urgency;
    }
}

