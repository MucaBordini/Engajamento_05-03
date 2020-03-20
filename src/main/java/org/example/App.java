package org.example;

//import java.lang.reflect.Array;
//import java.util.ArrayList;
import java.util.HashSet;
//mport java.util.List;
import java.util.Scanner;
import java.util.Set;


public class App {

    private static final Scanner sc = new Scanner(System.in);
    private static final Set<String> listaAlunos = new HashSet<>();

    public static void main(String[] args) {

        int i = 0;
        String option;

        do {

            System.out.println("\n----- Menu -----");
            System.out.println("[1] - Inserir Aluno");
            System.out.println("[2] - Imprimir Lista\n");
            System.out.println("[0] - Sair\n");
            option = sc.nextLine();

            switch (option) {
                case "1":
                    inserirAluno();
                    break;
                case "2":
                    exibirLista();
                    break;
                case "0":
                    // exibirLista();
                    break;
            }
        } while (!option.equals("0"));
    }

    private static void inserirAluno() {
        System.out.println("Insira o nome: ");
        String nome = sc.nextLine();
//        if(verificaNomeExistente(nome)){
        listaAlunos.add(nome);
//        }else{
//            System.out.println("\n#### NOME JA CADASTRADO ####\n");
//        }
    }

   // Removido verficação de Aluno repetido, pois está utilizando HashSet
   /* private static boolean verificaNomeExistente(String nome){
        for (String aluno : listaAlunos){
            if (aluno.getNome().equals(nome)){
                return false;
            }
        }
        return true;
    }*/

    private static void exibirLista() {
        System.out.println("----- Lista de nomes -----");
        for (String aluno : listaAlunos){
            System.out.println(aluno);
        }
    }
}
