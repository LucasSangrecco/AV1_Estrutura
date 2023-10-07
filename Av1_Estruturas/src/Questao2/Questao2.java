package Questao2;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        int[][] armario = new int[40][40];
        int opcao = 0;
        int id;
        int xampu = 0;
        int condicionador = 0;
        int hidratante = 0;
        int tintura = 0;
        int demaquilante = 0;
        int vazio = 0;

        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Digite o número da prateleira");
            int prateleira = ler.nextInt();
            System.out.println("Digite o número da posição");
            int posicao = ler.nextInt();
            System.out.println("Digite o id do produto: ");
            id = ler.nextInt();

            if(id<=5) {

                if (prateleira < 0 || prateleira > 40) {
                    System.out.println("Prateleira Inexistente");
                }

                if (posicao < 0 || posicao > 40) {
                    System.out.println("Armário Inexistente");
                }

                if (armario[posicao][prateleira] > 0) {
                    System.out.println("Espaço Insuficiente");
                }
                else {
                    if(id==1){
                        xampu++;
                    }
                    else if (id==2) {
                        condicionador++;
                    }
                    else if (id==3) {
                        hidratante++;
                    }
                    else if (id==4) {
                        tintura++;
                    }
                    else if (id==5) {
                        demaquilante++;
                    }
                    else {
                        vazio++;
                    }
                    armario[posicao][prateleira]++;
                    System.out.println("Caixa Adicionada");
                }


                System.out.println("Deseja continuar? <1>Sim <2>Não");
                opcao = ler.nextInt();

                switch (opcao) {
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
            }
            else {
                System.out.println("ID inexistente!");
            }
        }
        while (opcao != 2);

        System.out.println("Quantidade de caixas em cada prateleira/armario");

        for (int i= 0; i < armario.length; i++) {
            for (int j = 0; j < armario.length; j++) {
                System.out.print(armario[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Quantidade de caixas de xampu: " + xampu);
        System.out.println("Quantidade de caixas de condicionador: " + condicionador);
        System.out.println("Quantidade de caixas de hidratante " + hidratante);
        System.out.println("Quantidade de caixas de tintura: " + tintura);
        System.out.println("Quantidade de caixas de demaquilante: " + demaquilante);
        System.out.println("Quantidade de caixas vazias: " + vazio);
    }
}