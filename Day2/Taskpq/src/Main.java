import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        // Adding tasks with varying urgency
        taskQueue.add(new Task("Fix critical bug", 5));
        taskQueue.add(new Task("Code review", 3));
        taskQueue.add(new Task("Update documentation", 1));
        taskQueue.add(new Task("Respond to client email", 4));

        System.out.println("Executing tasks in order of urgency:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}
