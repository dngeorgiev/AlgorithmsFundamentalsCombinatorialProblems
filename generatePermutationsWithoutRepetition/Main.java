package generatePermutationsWithoutRepetition;

import java.util.Scanner;

public class Main {
    public static String[] elements;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        permuteWithoutRepetition(0);
    }

    private static void permuteWithoutRepetition(int index) {
        if (index == elements.length) {
            print(elements);
        } else {
            permuteWithoutRepetition(index + 1);
            for (int i = index + 1; i < elements.length; i++) {
                swap(elements, index, i);
                permuteWithoutRepetition(index + 1);
                swap(elements, index, i);
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
