package projeto_final_bloco_01;

import java.util.Scanner;


public class Menu {
    public static Scanner read = new Scanner(System.in);
  

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.runMenu();
        read.close();
    }

    public void runMenu() {
        int op;

        do {
            System.out.println("                                                    ");
            System.out.println("****************************************************");
            System.out.println("                                                    ");
            System.out.println("                  IngressoFut                       ");
            System.out.println("                                                    ");
            System.out.println("****************************************************");
            System.out.println("                                                    ");
            System.out.println("  1 - Adicionar ingressos                   ");
            System.out.println("  2 - Listar todos os jogos com ingressos a venda   ");
            System.out.println("  3 - Buscar ingresso pelo clube do coração         ");
            System.out.println("  4 - Atualizar info do ingresso                    ");
            System.out.println("  5 - Excluir ingresso a venda                       ");
            System.out.println("  6 - sair                                  ");
            System.out.println("                                                    ");
            System.out.println("****************************************************");
            System.out.print("digite o numero referente a opção desejada: ");
            op = read.nextInt();
            switch(op) {
            case 1: 
                System.out.println("Adicionar ingressos a venda");
            break;
            case 2:
                System.out.println("Listar todos os ingressos a venda ");
             
                
                break;
            case 3:
                System.out.println("Buscar ingresso pelo clube do coração");
               
                        break;
                    
               
            case 4:
                System.out.println("Atualizar info do ingresso");
                        break;
                    
              
            case 5:
                System.out.println("Excluir ingresso a venda");
                break;

            case 6:
                about();
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

    } while(op!=6);
}

public void about() {
    System.out.println("\n-----------------IngressoFut----------------------");
}
}
