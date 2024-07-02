package Ex14;

public class Agenda {
    private String nome;
    private String telefone;

    // Método para adicionar um contato
    public void adicionarContato(String nome, String telefone) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        if (telefone == null || telefone.isEmpty()) {
            throw new IllegalArgumentException("O telefone não pode ser nulo ou vazio.");
        }
        this.nome = nome;
        this.telefone = telefone;
    }

    // Método para obter o nome do contato
    public String getNome() {
        return nome;
    }

    // Método para obter o telefone do contato
    public String getTelefone() {
        return telefone;
    }
}


