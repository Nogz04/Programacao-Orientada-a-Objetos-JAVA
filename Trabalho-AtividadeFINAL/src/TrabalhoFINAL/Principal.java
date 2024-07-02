package TrabalhoFINAL;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//Pesquisei novas funções para implementar no código e me ajudar na criação dele.
//Deixei elas explicadas no código para lhe ajudar a entender caso tenha alguma dúvida professor!

public class Principal {

    private static final String FILE_NAME = "D:\\TreinoJAVA\\Trabalho-AtividadeFINAL\\produtos.txt"; //No meu PC o caminho do file é esse, no Disco Local D:.
                                                                                                     //Caso o Sr salve no D:. Para pesquisar o arquivo tem que ir no Explorador de Arquivos --> Disco Local D e pesquisar lá.
    private static ArrayList<Produtos> listaProdutos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produtos produto = null;

        try {
            while (true) {
                System.out.println("\n\n   =====MENU=====");
                System.out.println("\n1 - Cadastrar produto");
                System.out.println("2 - Alterar preço produto");
                System.out.println("3 - Excluir produto");
                System.out.println("4 - Listar produtos");
                System.out.println("5 - Sair do sistema");
                System.out.print("Escolha uma opção: ");
                int opcao = sc.nextInt();

                sc.nextLine(); //Limpando Buffer

                if (opcao == 1) {
                    System.out.println("Informe o código do produto: ");
                    int codigo = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Informe a descrição do produto: ");
                    String descricao = sc.nextLine();

                    System.out.println("Informe o preço de custo do produto: ");
                    double precoDeCusto = sc.nextDouble();

                    sc.nextLine();

                    System.out.println("Informe o preço de venda do produto: ");
                    double precoDeVenda = sc.nextDouble();

                    sc.nextLine();

                    System.out.println("Informe a quantidade de estoque do produto: ");
                    int estoqueDisponivel = sc.nextInt();

                    produto = new Produtos(codigo, descricao, precoDeCusto, precoDeVenda, estoqueDisponivel);
                    listaProdutos.add(produto);

                    // Salvando produtos no arquivo
                    salvarProdutos(); //O código deste método esta no final da main, em static.

                } else if (opcao == 2) {
                    System.out.println("Informe o Código do produto: ");
                    int codigo = sc.nextInt();

                    sc.nextLine();

                    boolean encontrado = false;
                    for (Produtos p : listaProdutos) {
                        if (p.getCodigo() == codigo) {
                            System.out.println("\nInforme o novo preço:");
                            double novoPreco = sc.nextDouble();
                            p.setPrecoDeVenda(novoPreco);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }

                    // Atualizando arquivo após alteração
                    salvarProdutos();

                } else if (opcao == 3) {
                    System.out.println("Informe o Código do produto a excluir: ");
                    int codigo = sc.nextInt();

                    sc.nextLine();

                    boolean removido = listaProdutos.removeIf(p -> p.getCodigo() == codigo);
                    // Aqui acima a expressão lambda(->) verifica se o código (getCodigo()) do produto
                    // p é igual ao código fornecido (codigo).
                    // Se essa condição for verdadeira, o produto p será removido da lista.

                    if (removido) {
                        System.out.println("Produto removido com sucesso.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }

                    // Atualizando arquivo após exclusão
                    salvarProdutos();

                } else if (opcao == 4) {
                    if (listaProdutos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("\n=====LISTA DE PRODUTOS=====");
                        for (Produtos p : listaProdutos) {
                            System.out.println(p);
                        }
                    }

                } else if (opcao == 5) {
                    break;

                } else {
                    System.out.println("Opção inválida.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally { //Define um bloco de código que deve ser executado após a conclusão do bloco try/catch.
            sc.close();
        }
    }

    private static void salvarProdutos() throws IOException {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Produtos p : listaProdutos) {
                escritor.write(p.getCodigo() + "," + p.getDescricao() + "," + p.getPrecoDeCusto() + "," + p.getPrecoDeVenda() + "," + p.getEstoqueDisponivel());
                escritor.newLine();
            }
        }
    }
    //FILE_NAME --> É uma constante que armazena o nome do arquivo onde os dados dos produtos serão armazenados ou lidos.

    //removeIf --> Ele permite remover elementos de uma coleção que correspondem a uma condição especificada.



}
