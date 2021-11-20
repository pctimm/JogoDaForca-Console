public class Jogador {
    private static int numInstanacias = 0;
    private char simbolo;
    Jogador(char opcao) {
        this.simbolo = opcao;
        numInstanacias ++;
    }
    public char getSimbolo() {
        return this.simbolo;
    }
}
