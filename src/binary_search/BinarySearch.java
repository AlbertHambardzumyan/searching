package binary_search;

public class BinarySearch {

    static int binarySearch(int searchKey, int[] data) {

        int low = 0; // low end of the search area
        int high = data.length - 1; // high end of the search area
        int middle = (low + high + 1) / 2; // middle element
        int location = -1; // return value; -1 if not found

        do {
            // if the element is found at the middle
            if (searchKey == data[middle])
                location = middle; // location is the current middle
                // middle element is too high
            else if (searchKey < data[middle])
                high = middle - 1; // eliminate the higher half
            else  // middle element is too low
                low = middle + 1; // eliminate the lower half
            middle = (low + high + 1) / 2; // recalculate the middle
        }
        while ((low <= high) && (location == -1));

        return location;
    }
}
