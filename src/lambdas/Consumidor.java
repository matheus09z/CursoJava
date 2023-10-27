package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimirNome =
                p -> System.out.println(p.nome + "!!!");


        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        Produto p2 = new Produto("nootebook", 2987, 0.25);
        Produto p3 = new Produto("caderno", 19.90, 0.03);
        Produto p4 = new Produto("borracha",  7.80, 0.18);
        Produto p5 = new Produto("lapis", 4.39, 0.19);

        imprimirNome.accept(p1);

        List<Produto> produtos = List.of(p1,p2,p3,p4,p5);

        produtos.forEach(imprimirNome);

        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);

    }
}
