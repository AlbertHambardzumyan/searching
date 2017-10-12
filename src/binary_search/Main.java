package binary_search;

import java.util.Random;

public class Main {
    private static final int size = 30;
    private static final Random generator = new Random();


    public static void main(String[] args) {
        int[] data = new int[size];

        // fill array with random ints in range 0-9
        for (int i = 0; i < size; i++)
            data[i] = generator.nextInt(10);

        int result = BinarySearch.binarySearch(4, data);
        System.out.println(result);
    }
}
