import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tarefas = new ArrayList<>();

    public void adicionarTarefa(Task tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (Task t : tarefas) {
            System.out.println(t);
        }
    }

    public void concluirTarefa(int id) {
        for (Task t : tarefas) {
            if (t.getId() == id) {
                t.concluir();
                System.out.println("Tarefa concluída!");
                return;
            }
        }

        System.out.println("Tarefa não encontrada.");
    }
}
