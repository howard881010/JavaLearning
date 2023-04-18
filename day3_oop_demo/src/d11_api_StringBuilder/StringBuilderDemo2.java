package d11_api_StringBuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        int[] arr = null;
        System.out.println(toString(arr));

        int[] arr1 = {10, 88, 99};
        System.out.println(arr1);
    }

    public static String toString(int[] arr) {
        if (arr != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i==arr.length - 1 ? "" : ", ");
            }
            sb.append("]");
            return sb.toString();

        } else {
            return null;
        }
    }
}
