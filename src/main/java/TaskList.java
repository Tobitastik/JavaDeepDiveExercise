import java.util.ArrayList;
import java.util.List;

public class TaskList<T extends Task> {
    private List<T> tasks;

    public TaskList() {
        tasks = new ArrayList<T>();
    }

    public void addTask(T task) {
        tasks.add(task);
    }

    public List<T> getTasks() {
        return tasks;
    }

    public void removeTask(T task) {
        tasks.remove(task);
    }

    public void setTasks(List<T> tasks) {
        this.tasks = tasks;
    }

    public void printAllTasks() {
        for (T task : tasks) {
            System.out.println(task);
        }
    }

    public void printTodayTasks(){

    }

    public void printOverdueTasks(){
        tasks.forEach(tasks -> );
    }

    public Task searchTask(String taskName) {
        for (T t : tasks) {
            if (t.getTitle().equals(taskName)) {
                return t;
            }
        }
    }

    public Task searchTaskDescription(String taskDescription) {
        for (T t : tasks) {
            if (t.getDescription().equals(taskDescription)) {
                return t;
            }
        }
    }
}
