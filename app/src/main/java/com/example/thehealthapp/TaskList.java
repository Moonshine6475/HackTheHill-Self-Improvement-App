import java.util.ArrayList;
import com.example.thehealthapp.tasks.Task;

public class TaskList{
    ArrayList<Task> tasks = new ArrayList<Task>();

    public void addTask(){
        Task task = new Task();
    }
    public void deleteTask(Task task){
        tasks.remove(task);
    }
    public void editTask(Task task){
        Task temp = tasks.get(tasks.indexOf(task));
        //popup same as new task popup
    }
}