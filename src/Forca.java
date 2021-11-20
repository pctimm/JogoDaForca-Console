import java.util.ArrayList;
import java.util.Scanner;
import Utilitarios.TratamentoString;

public class Forca extends Programa {
    Scanner teclado = new Scanner(System.in);

    private String palavraEscondida;
    private boolean palavraFoiEscrita;

    public Forca() {
        super("forca", "Jogo da Forca em Console");
        this.palavraFoiEscrita = false;
    }
    public Forca(String palavraEscondida) { // implementada quando tiver recurso de comandos na mesma linha
        super("forca", "Jogo da Forca em Console");
        this.palavraEscondida = palavraEscondida;
        this.palavraFoiEscrita = true;
    }

    public void executar() {
        int chances = 6;
        int precisaDescobrir;
        int letrasDescobertas = 0;
        ArrayList<Character> letrasTentadas = new ArrayList<>();
        System.out.println("Executando: Jogo da Forca");
        this.validaPalavraSePalavraEstaEscrita();
        this.palavraEscondida = TratamentoString.paraMaiusculo(palavraEscondida);
        precisaDescobrir = this.palavraEscondida.length();
        char[] palavraEmLista = this.palavraEscondida.toCharArray();
        char[] palavraRevelando = TratamentoString.gerarArrayComCensura(palavraEscondida.length());
        while (true) {
            if (chances == 0) {
                System.out.println("Você perdeu :(\n" +
                        "A palavra era: " + TratamentoString.arrayToString(palavraEmLista));
                break; // fim do programa
            }
            if (letrasDescobertas == precisaDescobrir) {
                System.out.println("Parabéns! :)\n" +
                        "A palavra era: " + TratamentoString.arrayToString(palavraEmLista));
                break; // fim do programa
            }
            this.mostraStatusJogo(chances, letrasTentadas, palavraRevelando);
            System.out.print("FORCA > ");
            String comando = teclado.nextLine();
            char letraAtual = TratamentoString.paraMaiusculo(TratamentoString.primeiraLetra(comando));
            if (!letrasTentadas.contains(letraAtual)) {
                letrasTentadas.add(letraAtual);
                if (TratamentoString.containsThisChar(palavraEmLista, letraAtual)) { // acertou
                    palavraRevelando = TratamentoString.copiarLetrasRepetidas(palavraEmLista, palavraRevelando, letraAtual);
                    letrasDescobertas = TratamentoString.contarLetrasDiferentesQueCaractere(palavraRevelando, '*');
                    // System.out.println("acertou");

                } else { // errado
                    System.out.println("Errou! -1   :(");
                    chances--;
                }
            } else {
                System.out.println("<!> Letra repetida");
            }
        }
        this.palavraEscondida = null;
        this.palavraFoiEscrita = false;
    }

    private void mostraStatusJogo(int chancesSobrando, ArrayList<Character> letrasTentadas, char[] revelando) {
        System.out.printf("CHANCES: %d | [ %s ]\n", chancesSobrando,
                TratamentoString.arrayToString(TratamentoString.arrayListToArray(letrasTentadas)));
        System.out.print("[ ");
        for (char c : revelando) {
            System.out.print(c + " ");
        }
        System.out.println("]");
    }
    private void validaPalavraSePalavraEstaEscrita() {
        while (true) {
            if (! this.palavraFoiEscrita) {
                System.out.println("<!> Palavra-escondida ainda não existe.");
                System.out.print("FORCA > ");
                String palavra = teclado.nextLine();
                this.palavraEscondida = TratamentoString.primeiroTermo(palavra);
                this.palavraFoiEscrita = true;
                break;
            }
            else {
                break;
            }
        }
    }
}
