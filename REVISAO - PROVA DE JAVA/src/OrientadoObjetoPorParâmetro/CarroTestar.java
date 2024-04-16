package OrientadoObjetoPorParâmetro;

public class CarroTestar {
    public static void main(String[] args) {

        //Intanciando Objeto

        Carro c1 = new Carro(); //Carro(); se diz respeito ao construtor

        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel  = 60;

        c1.acelerar(10);
        System.out.println("Velocidade: " + c1.vel + "Km/h");

        c1.freiar(30);
        System.out.println("Velocidade após freiar: " + c1.vel + "Km/h");

        System.out.println("Som de Buzina: ");
        c1.buzinar();
    }

}
