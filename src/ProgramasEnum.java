public enum ProgramasEnum {
    forca(new Forca()), console(new Console()), batata(new Batata()),
    jogodavelha(new JogoDaVelha());

    Programa instancia;
    ProgramasEnum(Programa p) {
        this.instancia = p;
    }
    public Programa getInstancia() {
        return this.instancia;
    }
}