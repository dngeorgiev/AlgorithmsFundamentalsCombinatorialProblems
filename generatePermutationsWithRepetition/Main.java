package generatePermutationsWithRepetition;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static String[] elements;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        permuteWithRepetition(0);
    }

    private static void permuteWithRepetition(int index) {
        if (index == elements.length) {
            print(elements);
        } else {
            permuteWithRepetition(index + 1);
            HashSet<String> swapped = new HashSet<>();
            swapped.add(elements[index]);
            for (int i = index + 1; i < elements.length; i++) {
                if (!swapped.contains(elements[i])) {
                    swap(elements, index, i);
                    permuteWithRepetition(index + 1);
                    swap(elements, index, i);
                    swapped.add(elements[i]);
                }
            }
        }
    }

    private static void swap(String[] elements, int firstIndex, int secondIndex) {
        String temp = elements[firstIndex];
        elements[firstIndex] = elements[secondIndex];
        elements[secondIndex] = temp;
    }

    private static void print(String[] permutes) {
        System.out.println(String.join(" ", permutes));
    }
}
