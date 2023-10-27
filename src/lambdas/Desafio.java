package lambdas;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Function<Produto, Double> precoFinal =
                num -> num.preco * (1 - num.desconto);


        UnaryOperator<Double> impostoMunicipal =  v ->
                v >= 2500? v * 1.085 : v;


        UnaryOperator<Double> frete = v ->
                v >=3000 ? v + 100 : v + 50;


        UnaryOperator<Double> arredondar = v ->
                Double.parseDouble(String.format("%.2f", v).replace(",", "."));

        Function<Double, String> formatar  =
                v -> ("R$" + v).replace(".",",");
        Produto p = new Produto("ipad", 3235.00, 0.13);
     String preco = precoFinal
             .andThen(impostoMunicipal)
             .andThen(frete)
             .andThen(arredondar)
             .andThen(formatar)
             .apply(p);

        System.out.println("O preço final é: " + preco);

    }
}
