package Ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        NotificacaoApp notificacaoApp = new NotificacaoApp();
        NotificacaoEmail notificacaoEmail = new NotificacaoEmail();

        Destinatario destinatario1 = new Destinatario("Matheus", "matheus@gmail.com");
        Destinatario destinatario2 = new Destinatario("Lucas", "lucas@gmail.com");
        Destinatario destinatario3 = new Destinatario("Luiza", "luiza@gmail.com");
        Destinatario destinatario4 = new Destinatario("Carol", "carol@gmail.com");

        //Emails Enviados:
        notificacaoEmail.enviar("\nParabéns " +destinatario1.getNome()+"! Você foi selecionado para a vaga de Engenheiro de Software!", destinatario1);
        notificacaoEmail.enviar("\nAtenção!!! Vagas abertas para Dev JAVA, mande já o seu curriculo!", destinatario4);

        System.out.println("=======================================================================\n");

        //Notificações do aplicativo DuoLingo
        notificacaoApp.enviar("\nNão perca sua ofensiva " +destinatario3.getNome()+"! Faça já a sua tarefa diária!", destinatario3);
        notificacaoApp.enviar("\nO torneio de Inglês está aberto! Inscreva-se já!", destinatario1);

        sc.close();
    }
}
