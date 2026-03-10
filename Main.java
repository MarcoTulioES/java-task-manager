import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        int opcao;

        do {
            System.out.println("\nGERENCIADOR DE TAREFAS");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("ID da tarefa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Descrição: ");
                    String desc = scanner.nextLine();

                    Task tarefa = new Task(id, desc);
                    manager.adicionarTarefa(tarefa);
                    break;

                case 2:
                    manager.listarTarefas();
                    break;

                case 3:
                    System.out.print("ID da tarefa para concluir: ");
                    int idConcluir = scanner.nextInt();
                    manager.concluirTarefa(idConcluir);
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
