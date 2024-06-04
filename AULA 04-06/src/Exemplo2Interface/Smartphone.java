package Exemplo2Interface;

public class Smartphone implements Celular, PC{

    String tel;
    String email;

    public Smartphone (String tel, String email){
        super();
        this.tel = tel;
        this.email = email;
    }

    public void exibirDados(){
        System.out.println("Tel: " + tel);
        System.out.println("Email: " + email);
    }

    @Override
    public void verificarEmail() {
        System.out.println("Verificando E-mails...");
    }

    @Override
    public void realizarChamada() {
        System.out.println("Realizando chamada...");
    }
}
