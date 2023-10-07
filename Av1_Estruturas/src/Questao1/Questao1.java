package Questao1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Questao1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        Deque <String> lista = new ArrayDeque<>();
        scanner = new Scanner(new File("Lista_URL.txt"));

        while (scanner.hasNextLine()) {
            lista.add(scanner.nextLine());
        }

        for (Iterator i = lista.iterator(); i.hasNext();){
            System.out.println(i.next() + " ");
        }

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o link para a exclusão: ");
        String linkExclusao = ler.nextLine();

        for (Iterator i = lista.iterator(); i.hasNext();){

            if(lista.contains(linkExclusao)){
                lista.remove(i);
                System.out.println("Link Excluido");
                break;
            }
            else{
                System.out.println("Link não encontrado");
                break;
            }
        }

        System.out.println(lista.size());

        for (Iterator i = lista.iterator(); i.hasNext();){
            System.out.println(i.next() + " ");
        }

        System.out.println("Digite o link para a exclusão: ");
        String linkPesquisa = ler.nextLine();

        for (Iterator i = lista.iterator(); i.hasNext();){
            if(linkPesquisa.equals(lista.contains(linkPesquisa))){
                System.out.println("Link encontrado");
                break;
            }
            else{
                System.out.println("Link não encontrado");
                break;
            }
        }
    }
}