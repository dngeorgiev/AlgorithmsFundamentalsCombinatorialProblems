package generatePermutationsWithRepetition;

import java.util.Scanner;

public class Main {
    public static String[] elements;
    public static String[] permutes;
    public static boolean[] used;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");
        permutes = new String[elements.length];
        used = new boolean[elements.length];

        permuteWithRepetition(0);
    }

    private static void permuteWithRepetition(int index) {
        if (index == elements.length) {
            print();
        } else {
            for (String element : elements) {
                permutes[index] = element;
                permuteWithRepetition(index + 1);
            }
        }
    }

    private static void print() {
        System.out.println(String.join(" ", permutes));
    }
}
