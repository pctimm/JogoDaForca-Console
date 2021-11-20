package Utilitarios;

import java.util.ArrayList;

public class TratamentoString {
    public static final int DIFERENCA_MAIUSCULA_MINUSCULA_ASCII = 32;
    public static String primeiroTermo(String linhaCompleta) {
        int primeiraOcorrenciaDoEspaco;
        try {
            primeiraOcorrenciaDoEspaco = linhaCompleta.indexOf(" ");
            return linhaCompleta.substring(0, primeiraOcorrenciaDoEspaco);
        } catch (StringIndexOutOfBoundsException e) {
            return linhaCompleta;
        }
    }

    public static char primeiraLetra(String palavra) {
        return palavra.charAt(0);
    }

    public static String paraMaiusculo(String palavra) {
        return palavra.toUpperCase();
    }

    public static char paraMaiusculo(char c) {
        boolean ehMaisculo = (c >= 65 && c <= 90); // 65 - 97
        if (!ehMaisculo) {
            c = (char) ((int) c - DIFERENCA_MAIUSCULA_MINUSCULA_ASCII);
            return c;
        }
        return c;
    }

    public static char[] arrayCensurar(char[] letras) {
        for (int i = 0; i < letras.length; i ++) {
            letras[i] = '*';
        }
        return letras;
    }

    public static String arrayToString(char[] letras) {
        String total = "";
        for (int i = 0; i < letras.length; i ++) {
            total += letras[i];
        }
        return total;
    }

    public static char[] arrayListToArray(ArrayList<Character> arrayList) {
        char[] returning = new char[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i ++) {
            returning[i] = arrayList.get(i);
        }
        return returning;
    }

    public static boolean containsThisChar(char[] array, char c) {
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == c) return true;
        }
        return false;
    }

    public static char[] gerarArrayComCensura(int tamanho) {
        char[] returning = new char[tamanho];
        for (int i = 0; i < tamanho; i ++) {
            returning[i] = '*';
        }
        return returning;
    }

    public static char[] gerarArrayComCensura(int tamanho, char tipoCensura) {
        char[] returning = new char[tamanho];
        for (int i = 0; i < tamanho; i ++) {
            returning[i] = tipoCensura;
        }
        return returning;
    }

    public static char[] copiarLetrasRepetidas(char[] original, char[] censurado, char letraABuscar) {
        for (int i = 0; i < original.length; i ++) {
            if (original[i] == letraABuscar) {
                censurado[i] = letraABuscar;
            }
        }
        return censurado;
    }
    public static int contarLetrasDiferentesQueCaractere(char[] array, char c) {
        int diferentes = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] != c) diferentes ++;
        }
        return diferentes;
    }
}

