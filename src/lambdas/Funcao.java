package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Impar";


        System.out.println(parOuImpar.apply(26));

        Function<String, String> oResultadoE =
                valor ->"O resultado é: " + valor;
        Function<String, String> empolgado = valor -> valor + "!!!";
        Function<String, String> duvida = valor ->valor +"???";


        // o 32 é passado para a primeira função e vai passando
        // para as outras o resultado
        String resultadoFinal =
                parOuImpar
                        .andThen(oResultadoE)
                        .andThen(empolgado)
                        .apply(32);

        System.out.println(resultadoFinal);

        String resultadoFinal2 =
                parOuImpar
                        .andThen(oResultadoE)
                        .andThen(duvida)
                        .apply(33);

        System.out.println(resultadoFinal2);
    }
}
