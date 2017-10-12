# Linear Search

The *linear search algorithm* searches each element in an array sequentially. If the search key does not match an 
 element in the array, the algorithm tests each element, and when the end of the array is reached, informs the user 
 that the search key is not present. If the search key is in the array, the algorithm tests each element until it finds
 one that matches the search key and returns the index of that element.
 
As an example, consider an array containing the following values
 ``` text
  34   56   2   10   77   51   93   30   5   52
 ```
 
 and a program that is searching for 51. Using the linear search algorithm, the program first checks whether 34 matches
 the search key. It does not, so the algorithm checks whether 56 matches the search key. The program continues moving 
 through the array sequentially, testing 2, then 10, then 77. When the program tests 51, which matches the search key, 
 the program returns the index 5, which is the location of 51 in the array. If, after checking every array element, the
 program determines that the search key does not match any element in the array, it returns a sentinel value (e.g., -1).
 
 
### Big O of the Linear Search
The linear search algorithm runs in O(n) time. The worst case in this algorithm is that every element must be checked
 to determine whether the search item exists in the array. If the size of the array is doubled, the number of 
 comparisons that the algorithm must perform is also doubled. Linear search can provide outstanding performance if the
 element matching the search key happens to be at or near the front of the array. But we seek algorithms that perform 
 well, on average, across all searches, including those where the element matching the search key is near the end of 
 the array.

Sometimes the simplest algorithms perform poorly. Their virtue is that they’re easy to program, test and debug. 
 Sometimes more complex algorithms are required to realize maximum performance.
 
[Application source code](https://github.com/AlbertHambardzumyan/searching/tree/master/src/linear_search)