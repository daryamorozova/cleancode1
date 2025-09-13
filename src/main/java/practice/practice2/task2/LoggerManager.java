package practice.practice2.task2;

public class LoggerManager {
    private static LoggerManager instance;

    private LoggerManager() {

    }

    public static LoggerManager getInstance() {
        if (instance == null) {
            instance = new LoggerManager();
        }
        return instance;
    }

    public void info(String msg) {
        System.out.println("INFO " + msg);
    }

    public void warning(String msg) {
        System.out.println("WARNING " + msg);
    }

    public void error(String msg) {
        System.out.println("ERROR " + msg);
    }

    public void displayLog(){
        System.out.println("displayLog");
    }
}