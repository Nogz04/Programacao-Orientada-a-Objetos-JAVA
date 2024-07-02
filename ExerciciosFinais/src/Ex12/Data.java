package Ex12;

public class Data {

    protected int dia;
    protected int mes;
    protected int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        ValidarData();
    }

    public void ValidarData() throws IllegalArgumentException{
        if (mes > 12 || mes < 1){
            throw new ExcecaoDataInvalida("Não existe mais de 12 meses ou mês 0!");
        }
        else if (ano >= 9999){
            throw new ExcecaoDataInvalida("Ano inválido!");
        }
        else if (mes == 2 && dia > 29){
            throw new ExcecaoDataInvalida("O mês de Fevereiro não tem dia 30 e nem 31.");
        }
        else if (dia > 31 || dia < 1){
            throw new ExcecaoDataInvalida("Não existe um mês com dia 0 ou dia 31.");
        }
        else{
            System.out.println("Data Válida!");
        }
    }

    public void ExibirData(){
        System.out.println("\nDATA: " + dia + "/" + mes + "/" + ano);
        System.out.println();
    }

}
