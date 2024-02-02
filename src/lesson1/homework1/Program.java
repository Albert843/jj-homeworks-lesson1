package lesson1.homework1;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double average = numbers.stream()
                .filter(num -> num % 2 == 0).mapToInt((num) -> num).summaryStatistics().getAverage();
        System.out.printf("Среднее значение всех четных чисел: " + average);
    }
}
