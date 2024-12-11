package Questao1;

import java.util.Scanner;

public class Main {
   static double consumoMedio = 12.0;
  static  double distancia = 360.0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço do combustível por litro: R$ ");
        double precoPorLitro = sc.nextDouble();
        double litrosNecessarios = distancia / consumoMedio;
        double custoTotal = litrosNecessarios * precoPorLitro;


        precodaViagem(precoPorLitro);

        System.out.printf("Quantidade de combustível necessária: %.2f litros\n", litrosNecessarios);
        System.out.printf("Custo total da viagem: R$ %.2f\n", custoTotal);



    }

    public static double precodaViagem(double precoPorLitro){
        double litrosNecessarios = distancia / consumoMedio;
        return litrosNecessarios;
    }

}
