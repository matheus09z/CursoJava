package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> {
            return x + y;
        };
        calc = (x, y) -> x + y;
        System.out.println(calc.apply(2.0 , 5.0));

        BinaryOperator<Integer> calc2 = (x, y) -> {
            return x + y;
        };
        calc2 = (x, y) -> x + y;
        System.out.println(calc2.apply(2 , 5));



    }
}
