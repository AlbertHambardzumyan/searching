# Binary Search

The *binary search algorithm* is more efficient than linear search, but it requires that the array be sorted. The first
 iteration of this algorithm tests the middle element in the array. If this matches the search key, the algorithm ends.
 Assuming the array is sorted in ascending order, then if the search key is less than the middle element, it cannot 
 match any element in the second half of the array and the algorithm continues with only the first half of the array 
 (i.e., the first element up to, but not including, the middle element). If the search key is greater than the middle 
 element, it cannot match any element in the first half of the array and the algorithm continues with only the second 
 half (i.e., the element after the middle element through the last element). Each iteration tests the middle value of 
 the remaining portion of the array. If the search key does not match the element, the algorithm eliminates half of the
 remaining elements. The algorithm ends by either finding an element that matches the search key or reducing the 
 subarray to zero size.
 
As an example consider the sorted 15-element array
 ``` text
  2 3 5 10 27 30 34 51 56 65 77 81 82 93 99
 ```
 
 and a search key of 65. A program implementing the binary search algorithm would first check whether 51 is the search 
 key (because 51 is the middle element of the array). The search key (65) is larger than 51, so 51 is ignored along 
 with the first half of the array (all elements smaller than 51), leaving
 ``` text
  56  65  77  81  82  93  99
 ```
 
Next, the algorithm checks whether 81 (the middle element of the remainder of the array) matches the search key. The 
 search key (65) is smaller than 81, so 81 is discarded along with the elements larger than 81. After just two tests, 
 the algorithm has narrowed the number of values to check to only three (56, 65 and 77). It then checks 65 (which 
 indeed matches the search key) and returns the index of the array element containing 65. This algorithm required just
 three comparisons to determine whether the search key matched an element of the array. Using a linear search algorithm
 would have required 10 comparisons. 
 
Note: In this example, we’ve chosen to use an array with 15 elements so that there will always be an obvious middle 
 element in the array. With an even number of elements, the middle of the array lies between two elements. We implement
 the algorithm to choose the higher of those two elements.

### Efficiency of the Binary Search
In the worst-case scenario, searching a sorted array of 1023 elements takes only 10 comparisons when using a binary 
 search. Repeatedly dividing 1023 by 2 (because after each comparison we can eliminate half the array) and rounding 
 down (because we also remove the middle element) yields the values 511, 255, 127, 63, 31, 15, 7, 3, 1 and 0. The 
 number 1023 (2^10 – 1) is divided by 2 only 10 times to get the value 0, which indicates that there are no more 
 elements to test. Dividing by 2 is equivalent to one comparison in the binary search algorithm. Thus, an array of 
 1,048,575 (2^20 – 1) elements takes a maximum of 20 comparisons to find the key, and an array of over one billion
 elements takes a maximum of 30 comparisons to find the key. This is a tremendous improvement in performance over the 
 linear search. For a one-billion-element array, this is a difference between an average of 500 million comparisons 
 for the linear search and a maximum of only 30 comparisons for the binary search! The maximum number of comparisons
 needed for the binary search of any sorted array is the exponent of the first power of 2 greater than the number of 
 elements in the array, which is represented as log2 n. All logarithms grow at roughly the same rate, so in big O 
 notation the base can be omitted. This results in a big O of O(log n) for a binary search, which is also known as 
 logarithmic run time.
 
[Application source code](https://github.com/AlbertHambardzumyan/searching/tree/master/src/linear_search)