package generateVariationsWithoutRepetition;

import java.util.Scanner;

public class Main {
    public static String[] elements;
    public static String[] variations;
    public static boolean[] used;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        int k = Integer.parseInt(scanner.nextLine());
        variations = new String[k];

        used = new boolean[elements.length];

        generateVariations(0);
    }

    private static void generateVariations(int index) {
        if (index == variations.length) {
            print();
        } else {
            for (int i = 0; i < elements.length; i++) {
                if (!used[i]) {
                    used[i] = true;
                    variations[index] = elements[i];
                    generateVariations(index + 1);
                    used[i] = false;
                }
            }
        }
    }

    private static void print() {
        System.out.println(String.join(" ", variations));
    }
}
