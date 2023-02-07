import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> toDo;

    public TodoList(){
        this.toDo = new ArrayList<>();
    }

    public void add(String task){
        toDo.add(task);
    }

    public void print(){
        for (int i = 0; i < this.toDo.size(); i++){
            System.out.println((i+1) +": "+ this.toDo.get(i));
        }
    }

    public void remove(int index){
        this.toDo.remove(index -1);
    }

}
