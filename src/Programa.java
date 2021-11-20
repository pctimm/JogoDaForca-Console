public abstract class Programa {
    protected String prefixo;
    protected String descricao;

    protected Programa(String prefixo, String descricao) {
        this.prefixo = prefixo;
        this.descricao = descricao;
    }

    public void executar() {

    }

    public String getPrefixo() {
        return this.prefixo;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
