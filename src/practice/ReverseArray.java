package practice;

import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] elements){
        int[] reversedElements = new int[elements.length];
        System.out.println("Array = " + Arrays.toString(elements));
        for(int i = 0; i< elements.length; i++) {
            reversedElements[i] = elements[elements.length - 1 - i];
        }
        System.out.println("Reversed array = " + Arrays.toString(reversedElements));
    }
}
