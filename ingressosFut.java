package projeto_final_bloco_01;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import tiposdeIngresso.model.Ingresso;

public class ingressosFut {
	
	private List<Ingresso> ingressos = new ArrayList<>();
    public static Scanner read = new Scanner(System.in);
  

    public static void main(String[] args) {
        ingressosFut menu = new ingressosFut();
        menu.runMenu();
        read.close();
    }

    public void runMenu() {
        int op;

        do {
            System.out.println("****************************************************");
            System.out.println("                  IngressoSports                     ");
            System.out.println("****************************************************");
            System.out.println("  1 - Adicionar ingressos");
            System.out.println("  2 - Listar todos os jogos com ingressos a venda");
            System.out.println("  3 - Buscar ingresso pelo id");
            System.out.println("  4 - Atualizar info do ingresso");
            System.out.println("  5 - Excluir ingresso a venda");
            System.out.println("  6 - Sair");
            System.out.println("****************************************************");
            System.out.print("Digite o número referente à opção desejada: ");
            op = read.nextInt();
            switch(op) {
                case 1: 
                    System.out.println(" Adicionar ingressos a venda");
                    System.out.print(" Digite codigo do ingresso ");
                    int id = read.nextInt();
                    System.out.print(" Digite o tipo do ingresso: 1-futebol 2-basquete ");
                    int tipo = read.nextInt();
                    System.out.print(" para qual clube é esse ingresso? : ");
                    String nome = read.next();
                    System.out.print(" Digite o valor do produto: ");
                    float valor = read.nextFloat();
                    Ingresso ingressoNovo = new Ingresso(id, tipo, nome, valor);
                    ingressos.add(ingressoNovo);
                    System.out.println("Ingresso adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Listar todos produtos ");
                    for (Ingresso ingresso : ingressos) {
                        ingresso.visualizar();
                    }
                    break;
                case 3:
                    System.out.println("Buscar ingresso pelo id");
                    System.out.print("Digite o o id você está procurando: ");
                    int idBusca = read.nextInt();
                    for (Ingresso ingresso : ingressos) {
                        if (ingresso.getId() == idBusca) {
                            ingresso.visualizar();
                            break;
                        }
                    }
                    break;
                case 4:
                	System.out.println("Atualizar info do produto");
    				System.out.print("Digite o ID do produto que você deseja atualizar: ");
    				int idAtualizar = read.nextInt();
    				for (Ingresso ingresso : ingressos) {
    					if (ingresso.getId() == idAtualizar) {
    						System.out.print("Digite o novo tipo do produto: ");
    						int novoTipo = read.nextInt();
    						System.out.print("Digite o novo nome do produto: ");
    						String novoNome = read.next();
    						System.out.print("Digite o novo valor do produto: ");
    						float novoValor = read.nextFloat();
    						ingresso.setTipo(novoTipo);
    						ingresso.setNome(novoNome);
    						ingresso.setValor(novoValor);
    						System.out.println("Informações do produto atualizadas com sucesso!");
    						break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Excluir ingresso a venda");
                    System.out.print("Digite o ID do produto que você deseja excluir: ");
                    int idExcluir = read.nextInt();
                    ingressos.removeIf(ingresso -> ingresso.getId() == idExcluir);
                    System.out.println("Produto excluído com sucesso!");
                    break;
                case 6:
                    System.out.println("Saindo...");
                    System.out.println("\n---------------------IngressoSports---------------");
            		System.out.println("****************************************************");
            		System.out.println("Desenvolvedor  : Natan Oliveira Santos              ");
            		System.out.println("****************************************************");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while(op != 6);
    }
}