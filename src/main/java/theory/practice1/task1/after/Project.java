package theory.practice1.task1.after;

class Project {
    private UserRepository userRepository;
    private TaskRepository taskRepository;

    public Project(UserRepository userResository, TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userResository;
    }

    public void addTask(Task task) {
        taskRepository.addTask(task);
    }

    public void assignTaskToUser(String title, String username) {
        Task task = taskRepository.findTask(title);
        task.setUser(userRepository.findUser(username));
        System.out.println("Task " + title + " was assign to " + username);
    }

    public void completeTask(String title) {
        Task task = taskRepository.findTask(title);
        task.setCompleted(true);
        System.out.println("Task " + title + " was completed");
    }
}
