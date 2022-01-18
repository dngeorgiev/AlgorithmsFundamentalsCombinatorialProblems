package generateCombinationsWithoutRepetition;

import java.util.Scanner;

public class Main {
    public static String[] elements;
    public static String[] combinations;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        int k = Integer.parseInt(scanner.nextLine());
        combinations = new String[k];

        generateCombinationsWithoutRepetition(0, 0);
    }

    private static void generateCombinationsWithoutRepetition(int index, int start) {
        if (index == combinations.length) {
            print();
        } else {
            for (int i = start; i < elements.length; i++) {
                combinations[index] = elements[i];
                generateCombinationsWithoutRepetition(index + 1, i + 1);
            }
        }
    }

    private static void print() {
        System.out.println(String.join(" ", combinations));
    }
}
