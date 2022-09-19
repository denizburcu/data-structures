package practice;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public int readInteger() {
        return scanner.nextInt();
    }

    public int[] readElements(int capacity) {
        int[] elements = new int[capacity];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
        }
        return elements;

    }

    public int findMin(int[] elements) {
        int minElement = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < minElement) {
                minElement = elements[i];
            }
        }
        return minElement;

    }
}
