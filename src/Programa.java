public abstract class Programa implements Executavel {
    protected String prefixo;
    protected String descricao;

    protected Programa(String prefixo, String descricao) {
        this.prefixo = prefixo;
        this.descricao = descricao;
    }

    public String getPrefixo() {
        return this.prefixo;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
