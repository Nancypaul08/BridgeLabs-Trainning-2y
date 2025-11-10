package Maximum_of_Three;

class MaxUtil {

    // T must implement Comparable to compare values
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;  // assume x is largest to start

        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }
}

