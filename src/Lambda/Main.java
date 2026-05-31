package Lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MathOperation mathOperation  = new MathOperation() {

            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        StringManipulator toUpperCase = String::toUpperCase;
        System.out.println("Uppercase: " + toUpperCase.manipulate("hello world"));

        Function<String, Integer> countUppercaseFunc = StringListProcessor::countUppercase;
        System.out.println("Кількість великих літер: " + countUppercaseFunc.apply("HeLLo WoRLd"));

        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Випадкове число (1-100): " + randomSupplier.get());
    }

}
