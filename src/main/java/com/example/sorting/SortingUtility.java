package com.example.sorting;

public class SortingUtility {

    /**
     * Part A Gnome Sort Algorithm
     * <p>
     * Implement gnome sort per this pseudocode.
     * <p>
     * <pre>
     *    method gnomeSort(a[])
     *       pos = 0
     *       while pos < length(a)
     *          if (pos == 0 or a[pos] >= a[pos-1])
     *          pos = pos + 1
     *       else
     *          swap a[pos] and a[pos-1]
     *          pos = pos - 1
     * </pre>
     *
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a>
     */
    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        // TODO implement pseudocode above

        int pos = 0;

        //nested loop
        //the if statement moves higher value to the right
        //the else statement moves lower value to the left

        while(pos < data.length) {
            if (pos == 0 || data[pos].compareTo(data[pos - 1]) >= 0){
                pos++;
            }else{
                swap(data, pos, pos - 1);
                pos--;
            }
        }

    }

    /**
     * Part B Optimized Gnome Sort Algorithm.
     * <p>
     * Implement an optimized gnome sort per the pseudocode below.
     * <p>
     * <pre>
     *    method gnomierSort(a[])
     *       for pos in 1 to length(a)
     *       gnomierSort(a, pos)
     * </pre>
     *
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a>
     */
    public static <T extends Comparable<T>> void gnomierSort(T[] data) {

        // TODO implement pseudocode above

        int pos;

        //implemented the method using a nested for loop
        for(pos = 1; pos < data.length -1; pos++) {

            gnomierSort(data, pos);
        }

    }

    /**
     * Part C Optimized Gnome Sort Algorithm
     * <p>
     * Implement an optimized gnome sort per the pseudocode below.
     * <p>
     * <pre>
     *    method gnomierSort(a[], upperBound)
     *       pos = upperBound
     *       while pos > 0 and a[pos-1] > a[pos]
     *          swap a[pos-1] and a[pos]
     *          pos = pos - 1
     * </pre>
     *
     * @param data
     * @param <T>
     */
    private static <T extends Comparable<T>> void gnomierSort(T[] data, int upperBound) {

        // TODO implement pseudocode above

        int pos = upperBound;

        //implemented the method using a nested while loop
        while (pos > 0 &&  data[pos -1].compareTo(data[pos]) > 0) {
            swap(data, pos -1, pos);
            pos--;
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}
