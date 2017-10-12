package linear_search;

public class LinearSearch {

    static int linearSearch(int searchKey, int[] data) {

        // loop through array sequentially
        for (int index = 0; index < data.length; index++)
            if (data[index] == searchKey)
                return index; // return index of integer

        return -1; // integer was not found
    }
}
