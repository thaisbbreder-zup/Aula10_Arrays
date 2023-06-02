import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class E01 {
    public static void main(String[] args) {

        System.out.println("-------------- TO DO LIST --------------");
        List<String> toDo = new ArrayList<>();

        //adiciona as tarefas
        toDo.add("comprar biscoito");
        toDo.add("estudar para prova");
        toDo.add("dar banho no cachorro");

        //remove uma tarefa
        toDo.remove(1);

        //imprimi as tarefas restantes
        System.out.println("As tarefas a serem feitas hoje são:" + "\n1: " + toDo.get(0) + "\n2: " + toDo.get(1));
    }
}
