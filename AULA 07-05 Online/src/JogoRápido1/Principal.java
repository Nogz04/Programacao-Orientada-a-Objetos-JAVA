package JogoRápido1;

public class Principal extends Cachorro{
    public static void main(String[] args) {

        Cachorro c = new Cachorro();

        c.setNome("Tobi");
        c.setIdade(5);
        c.setSom("auauauau");
        c.setRaca("Pugg");



        System.out.println("Nome: " + c.getNome());
        System.out.println("Idade: " + c.getIdade());
        System.out.println("Raça: " + c.getRaca());
        System.out.print("Som: " );
        c.latir();


    }
}
