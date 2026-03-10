public class Task {

    private int id;
    private String descricao;
    private boolean concluida;

    public Task(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Tarefa: " + descricao + " | Concluída: " + concluida;
    }
}
