package generateVariationsWithRepetition;

import java.util.Scanner;

public class Main {
    public static String[] elements;
    public static String[] variations;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        int k = Integer.parseInt(scanner.nextLine());
        variations = new String[k];

        generateVariationsWithRepetition(0);
    }

    private static void generateVariationsWithRepetition(int index) {
        if (index == variations.length) {
            print();
        } else {
            for (int i = 0; i < elements.length; i++) {
                variations[index] = elements[i];
                generateVariationsWithRepetition(index + 1);
            }
        }
    }

    private static void print() {
        System.out.println(String.join(" ", variations));
    }
}
