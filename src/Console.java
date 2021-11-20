import java.util.HashMap;
import java.util.Scanner;
import Utilitarios.TratamentoString;

public class Console extends Programa {
    private static HashMap<ProgramasEnum, Programa> listaDeProgramas = new HashMap<>();

    Console () {
        super("console", "Console para execução de Programas - " +
                "PSoft Computing Services ©1984");
    }


    public static void main(String[] args) {
        criarLista();
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.print("@root: ");
            String linhaEscrita = teclado.nextLine();
            String comandoPrefix = TratamentoString.primeiroTermo(linhaEscrita);
            ProgramasEnum programaAExecutar;
            try {
                programaAExecutar = ProgramasEnum.valueOf(comandoPrefix);
            } catch (IllegalArgumentException e) {
                System.out.println("<!> argumento escrito não existe.");
                continue;
            }
            Programa p = listaDeProgramas.get(programaAExecutar);
            p.executar();
        }
    }

    @Override
    public void executar() {
        System.out.println("Executando: Console para execução de Programas - " +
                "PSoft Computing Services ©1984");
    }

    private static void criarLista() {
        ProgramasEnum[] stream = ProgramasEnum.values();
        for (ProgramasEnum aux : stream) {
            listaDeProgramas.put(aux, aux.getInstancia());
        }
    }
}
