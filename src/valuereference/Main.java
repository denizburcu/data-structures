package valuereference;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherValue = " + anotherValue);

        anotherValue ++;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherValue = " + anotherValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

        myIntArray[1] = 17;
        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

    }
    private static void modifyArray(int[] array)  {

        array = new int[] { 1, 2, 3, 4, 5};

        array[2] = 20;
    }

}
