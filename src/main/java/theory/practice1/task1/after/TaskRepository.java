package theory.practice1.task1.after;

import java.util.ArrayList;
import java.util.List;

class TaskRepository {
    private List<Task> tasks;

    public TaskRepository() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added: " + task.getTitle());
    }

    public Task findTask(String title) {
        System.out.println("We are trying to find task: " + title);
        return tasks.stream().filter(it -> it.getTitle().equals(title)).findFirst().get();
    }
}
