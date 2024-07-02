package Ex3;

public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Carro("Toyota", "Corolla", 2016);
        Veiculo moto = new Moto("Honda", "CB1000R", 2018);

        System.out.println("===== INFOS DO CARRO =====");

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());

        System.out.println("\nAção 1:");
        carro.acelerar();
        System.out.println("Ação 2:");
        carro.frear();

        System.out.println();

        System.out.println("===== INFOS DA MOTO =====");

        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());

        System.out.println("\nAção 1:");
        moto.acelerar();
        System.out.println("Ação 2:");
        moto.frear();



    }
}
