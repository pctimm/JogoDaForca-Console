import org.junit.Assert;
import org.junit.Test;
import Utilitarios.TratamentoString;
public class TratamentoStringTest {
    @Test
    public void retornarRepetidas() {
        char[] lista = {'*', 'a', '*', 'e', 't', 'a'};
        int espero = 4;
        int resultado = TratamentoString.contarLetrasDiferentesQueCaractere(lista, '*');
        Assert.assertEquals(espero, resultado);
    }
}
