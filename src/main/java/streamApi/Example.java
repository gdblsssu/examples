package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Example {
    public static void main(String[] args) {
        final List<String> listString = List.of("one", "two", "three");
        final List<Integer> listInt = List.of(3, 2, 5, 1, 27 ,44, 22, 16, 16, 3);

        /*// to UpperCase
        listString.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);*/

        /*//Write a Java program to calculate the sum of all even, odd numbers in a list using streams
        int sumEven = listInt.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (a, b) -> a + b);
        System.out.print(sumEven);

        int sumOdd = listInt.stream()
                .filter(x -> x % 2 != 0)
                .mapToInt(Integer:: intValue)
                .sum();
        System.out.print(sumEven);*/

        /*//Write a Java program to remove all duplicate elements from a list using streams.
        listInt.stream()
                .distinct()
                .collect(Collectors.toList());*/


        /*//Write a Java program to count the number of strings in a list that start with a specific letter using streams.
        long count = listString.stream()
                .filter(s -> s.startsWith("o"))
                .count();
        System.out.println(count);*/


        /*//Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        List<String> res = listString.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(res);*/


        /*//Write a Java program to find the maximum and minimum values in a list of integers using streams.
        int max = listInt.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.println(max);

        max = listInt.stream()
                .max(Integer::compare)
                .orElse(0);
        System.out.println(max);*/

        /*// Write a Java program to find the second smallest and largest elements in a list of integers using streams.
        int second = listInt.stream()
                .sorted()
                .skip(1)
                .limit(1)
                .findFirst()
                .orElse(0);
        System.out.println(second); */

        //find the maximum element in an array
        int[] arr = new int[]{3, 1, 3, 5, 5};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

    }
}
