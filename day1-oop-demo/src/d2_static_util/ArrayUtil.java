package d2_static_util;

public class ArrayUtil {
    private ArrayUtil() {

    }

    public static String toString(int [] arr) {
        if (arr == null) {
            return null;
        } else {
            String result = "[";
            for (int i = 0; i < arr.length; i++) {
                result += (i == arr.length - 1 ? arr[i]: arr[i] + ", ");
            }
            result += "]";
            return result;
        }
    }
}
