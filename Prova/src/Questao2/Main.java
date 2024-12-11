package Questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número de alunos na turma: ");
        int sc = scanner.nextInt();
        scanner.nextLine();
        String[] nomes = new String[sc];
        double[] notas = new double[sc];

  for (int i = 0; i < sc; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a nota de " + nomes[i] + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }


        double soma = 0;
        for (int i = 0; i < sc; i++) {
            soma += notas[i];
        }
        double media = soma / sc;


        System.out.println("Alunos com nota acima da média (" + media + "):");  for (int i = 0; i < sc; i++) {
            if (notas[i] > media) {
                System.out.println("Nota do "+ nomes[i] + " è " + notas[i]);
            }else{
                System.out.println("Ninguem atingiu a média");
            }
        }


    }
}
