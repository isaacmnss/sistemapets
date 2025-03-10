package view;

import java.util.Scanner;

public class Menu {
    void executarMenu(){
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        while (opc != 6){
            System.out.println("Selecione uma opção\n");
            System.out.println("1. Cadastrar um novo pet");
            System.out.println("2. Alterar os dados do pet cadastrado");
            System.out.println("3. Deletar um pet cadastrado");
            System.out.println("4. Listar todos os pets cadastrados");
            System.out.println("5. Listar pets por critério (idade, nome, raça)");
            System.out.println("6. Sair");

            opc = sc.nextInt();

            switch (opc){
                case 1 :
                    System.out.println("Cadastrando pet...");
                    break;
                case 2:
                    System.out.println("Alterar dados");
                    break;
                case 3:
                    System.out.println("opção 3");
                    break;
                case 4:
                    System.out.println("opção 4");
                    break;
                case 5:
                    System.out.println("opção 5");
                    break;
                case 6:
                    System.out.println("Finalizando execução...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }
    }
}
