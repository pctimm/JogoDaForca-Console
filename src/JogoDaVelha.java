import java.util.InputMismatchException;
import java.util.Scanner;
import Utilitarios.TratamentoString;
import java.util.Random;

public class JogoDaVelha extends Programa {
    Scanner teclado = new Scanner(System.in);
    public static final char X = 'X';
    public static final char O = '◯';

    public JogoDaVelha() {
        super("jogodavelha", "Jogo da Velha entre dois jogadores - TIC-TAC-TOE");
    }


    @Override
    public void executar() {
        System.out.println("Executando: " + this.descricao);
        Jogador j1;
        Jogador j2;
        while (true) {
            int comando;
            System.out.println("Qual símbolo o jogador 1 prefere?\n" +
                    "[1] X\n" +
                    "[2] ◯\n" +
                    "[3] aleatório");
            System.out.printf("JOGODAVELHA > ");
            try {
                comando = teclado.nextInt();
                if (comando < 1 || comando > 3) throw new InputMismatchException();
            } catch (InputMismatchException exception) {
                System.out.println("<!> não foi informado um número válido.");
                continue;
            }
            if (comando == 1) {
                j1 = new Jogador(X);
                j2 = new Jogador(O);
            } else if (comando == 2) {
                j1 = new Jogador(O);
                j2 = new Jogador(X);
            } else {
                Random r = new Random();
                int escolha = r.nextInt(2);
                if (escolha == 0) {
                    j1 = new Jogador(O);
                    j2 = new Jogador(X);
                } else {
                    j1 = new Jogador(X);
                    j2 = new Jogador(O);
                }
            }
            break;
        }
        System.out.printf("Entendido! J1: %c | J2: %c \n", j1.getSimbolo(), j2.getSimbolo());
    }
}