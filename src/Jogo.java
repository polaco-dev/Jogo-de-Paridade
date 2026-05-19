import java.util.Scanner;
public class Jogo {

    public Jogo() {

    }       

    public void iniciarPartida() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um nome de usuário: ");
        String nomeJogador = scanner.next();

        System.out.println("Escolha PAR ou IMPAR: ");
        String escolhaJogador = scanner.next();

        System.out.println("Escolha um número inteiro de (0 a 5): ");
        int numeroJogador = scanner.nextInt();

        Computador computador = new Computador();

        int numeroComputador = computador.gerarNumero();

        int somaParidade = numeroJogador + numeroComputador;

        System.out.println("Nome do Jogador: " + nomeJogador);
        System.out.println("Escolha do jogador: " + escolhaJogador);
        System.out.println("Número do jogador: " + numeroJogador);
        System.out.println("Número do computador: " + numeroComputador);
        System.out.println("A soma da paridade: " + somaParidade);

        verificarParidade(somaParidade);
        verificarVencedor(escolhaJogador, somaParidade);

        scanner.close();
    }

    public void verificarParidade(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }

    public void verificarVencedor(String escolhaJogador, int somarParidade) {
        if (escolhaJogador.equalsIgnoreCase("PAR")) {
            
            if (somarParidade % 2 == 0) {
                System.out.println("PAR");
                System.out.println("Jogador ganhou!");
            } else {
                System.out.println("Computador ganhou!");
            }
        } else {
            if (escolhaJogador.equalsIgnoreCase("IMPAR")) {

                if(somarParidade % 2 != 0) {
                    System.out.println("IMPAR");
                    System.out.println("Jogador ganhou!");    
                } else {
                    System.out.println("Computador ganhou!");
                }
            }
        }    
    }
}
