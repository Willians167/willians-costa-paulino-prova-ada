package Questao3;


    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número de membros da família: ");
            int numeroDeMembros = scanner.nextInt();
            System.out.print("Digite o número de fatias da pizza: ");
            int numeroDeFatias = scanner.nextInt();
            int fatiasPorMembro = numeroDeFatias / numeroDeMembros;
            int sobras = numeroDeFatias % numeroDeMembros;
            System.out.println("Cada membro receberá " + fatiasPorMembro + " fatias.");

            if (sobras > 0) {
                System.out.println("Haverá " + sobras + " fatias sobrando.");

                int fatiasAdicionais = numeroDeMembros - sobras;
                System.out.println("Adicione mais " + fatiasAdicionais + " fatias para que todos recebam a mesma quantidade.");
            } else {
                System.out.println("A pizza foi igualmente dividida, sem sobras.");
            }


        }
    }


