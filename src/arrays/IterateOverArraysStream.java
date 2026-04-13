package arrays;

import java.util.Arrays;
import java.util.OptionalDouble;

public class IterateOverArraysStream {
    void main() {

        long[] numbers = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        double result = Arrays.stream(numbers).average().orElse(0);
        System.out.println(result);

        Arrays.stream(numbers).forEach(System.out::println);

    }
}
