package Ex14;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        System.out.println("\n    =====TESTE VÁLIDO=====");
        try {
            agenda.adicionarContato("Matheus", "55984919191");
            System.out.println("\nNome: " + agenda.getNome() + ", Telefone: " + agenda.getTelefone());
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        System.out.println("\n\n    =====TESTE INVÁLIDO=====");
        try {
            agenda.adicionarContato("", "55984832727"); //Se preencher o nome e não o contato, a mensagem da Exception irá mudar, vice-versa.
            System.out.println("\nNome: " + agenda.getNome() + ", Telefone: " + agenda.getTelefone());
        } catch (IllegalArgumentException e) {
            System.out.println("\nERRO: " + e.getMessage());
        }
    }
}


