package theory.practice1.task1.before;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Project {
    private List<Task> tasks = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addTask(String title, String description, Date dueDate) {
        Task task = new Task(title, description, dueDate);
        tasks.add(task);
        System.out.println("Task added: " + title);
    }

    public void assignTaskToUser(String title, String username) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                for (User user : users) {
                    if (user.getUsername().equals(username)) {
                        task.setUser(user);
                        System.out.println("Task " + title + " assigned to " + username);
                    }
                }
            }
        }
    }

    public void completeTask(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                task.setCompleted(true);
                System.out.println("Task completed: " + title);
            }
        }
    }
}
