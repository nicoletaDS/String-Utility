import java.util.ArrayList;

/**
 * This utility class provides functionality for integer data types.
 */
public final class IntegerUtility {

    /**
     * Private constructor for utility class {@link IntegerUtility},
     * to avoid instantiation.
     *
     * @throws UnsupportedOperationException because a utility class should
     *                                       not be instantiated.
     */
    private IntegerUtility() {
        throw new UnsupportedOperationException("Utility class cannot " +
                "be instantiated.");
    }

    /**
     * Calculates all the values greater than a given value(threshold).
     *
     * @param values    the array containing all the values to be compared
     * @param threshold all the valid values should be greater than this threshold
     * @return a new array containing all the values from the given array,
     * that are greater than the specified value
     */
    public static int[] greaterThan(final int[] values, final int threshold) {
        int[] greaterValues = new int[values.length];
        int index = 0;
        for (int value : values) {
            if (value > threshold) {
                greaterValues[index] = value;
                index++;
            }
        }

        // Return an array truncated to the length of values added
        return truncate(greaterValues, index);
    }

    /**
     * Select all the od values from the provided array list
     *
     * @param values the array containing all the values
     * @return a new array list containing only the odd values from the given list
     */
    public static int[] getOdds(final int[] values) {
        int[] odds = new int[values.length];
        int index = 0;
        for (int value : values) {
            if (value % 2 != 0) {
                odds[index] = value;
                index++;
            }
        }
        // Return an array truncated to the length of values added
        return truncate(odds, index);
    }

    /**
     * Search for the first occurrence of the given key, and return its index
     *
     * @param values the array where the key is searched
     * @param key    the searched value
     * @return the key index in values or -1 if the key is not in the array
     */
    public static int search(final int[] values, final int key) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == key)
                return i;
        }
        return -1;
    }

    /**
     * Sort an array using the bubble sort method.
     *
     * @param values the array to be sorted
     * @return a new array list containing all the integer from values
     * in an ascending order
     */
    public static int[] sort(final int[] values) {

        int i, j, n = values.length;
        int[] sorted = new int[n];
        for (i = 0; i < n; i++) {
            sorted[i] = values[i];
        }

        // Sort copied array with bubble sort
        for (i = 0; i < n - 1; i++)
            // Last i elements are already in place
            for (j = 0; j < n - i - 1; j++)
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                }

        return sorted;
    }

    /**
     * @param values the array list with all the values
     * @return the media value from all the values in the list
     */
    public static double median(final int[] values) {
        // Sort array and calculate its (high) middle index.
        int[] sortedArray = sort(values);
        int flooredHalfLength = sortedArray.length / 2;

        // Calculate median
        double median;
        if (sortedArray.length % 2 != 0) {
            median = sortedArray[flooredHalfLength];
        } else {
            int topHalfValue = sortedArray[flooredHalfLength];
            int bottomHalfValue = sortedArray[flooredHalfLength - 1];
            median = ((double) topHalfValue + (double) bottomHalfValue) / 2;
        }
        return median;
    }

    /**
     * Find all the common elements between two arrays.
     *
     * @param a the first array list
     * @param b the second array list
     * @return a new array list containing all the common elements.
     */
    public static int[] common(final int[] a, final int[] b) {
        int[] common = new int[a.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (search(b, a[i]) != -1) {
                common[i] = a[i];
                index++;
            }
        }
        return truncate(common, index);
    }

    /**
     * Truncates an array to a specific length by cutting off its top
     * (high index) values.
     *
     * @param values the array to be truncated
     * @param length the length the array should be truncated to
     * @return the truncated array
     */
    private static int[] truncate(final int[] values, final int length) {
        // Check whether array is long enough for requested truncation.
        if (length > values.length) {
            throw new IllegalArgumentException("Array length is insufficient for number of values.");
        }

        // Truncate array to number of written values and return it.
        int[] truncatedValues = new int[length];
        if (length >= 0) System.arraycopy(values, 0, truncatedValues, 0, length);
        return truncatedValues;
    }
}
