package com.codedifferently.problem01;
import java.util.*;
public class Solution {
    /**
     * You will be given an array of numbers, search the array and return the longest
     * set of consecutive numbers
     * example input - {1,3,2,10,6,5,7,8}
     * return the String "Longest Set: {5 6 7 8}"
     * Even though 1,2,3 would the first consecutive set 5,6,7,8 is longer
     *
     * @param allNumbers
     * @return
     */
    public String findLongestConsecutiveSet(Integer[] allNumbers){
      for (int i =0; i < allNumbers.length; i++){
        if (allNumbers[i])
      }
        return null;
      }
     }


    class GFG {

        // Function to find consecutive ranges
        static List<String>
        consecutiveRanges(int[] a) {
            int length = 1;
            List<String> list
                    = new ArrayList<String>();

            // If the array is empty,
            // return the list
            if (a.length == 0) {
                return list;
            }

            // Traverse the array from first position
            for (int i = 1; i <= a.length; i++) {

                // Check the difference between the
                // current and the previous elements
                // If the difference doesn't equal to 1
                // just increment the length variable.
                if (i == a.length
                        || a[i] - a[i - 1] != 1) {

                    // If the range contains
                    // only one element.
                    // add it into the list.
                    if (length == 1) {
                        list.add(
                                String.valueOf(a[i - length]));
                    } else {

                        // Build the range between the first
                        // element of the range and the
                        // current previous element as the
                        // last range.
                        list.add(a[i - length]
                                + " -> " + a[i - 1]);
                    }

                    // After finding the first range
                    // initialize the length by 1 to
                    // build the next range.
                    length = 1;
                } else {
                    length++;
                }
            }

            return list;
        }
    }
}
