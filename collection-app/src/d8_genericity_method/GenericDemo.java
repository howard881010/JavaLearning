package d8_genericity_method;

public class GenericDemo {
    public static void main(String[] args) {
        String[] names = {"aaa", "bbb", "ccc"};
        printArray(names);

        Integer[] ages = {18, 22, 25};
        printArray(ages);
        Integer[] arr1 = getArr(ages);
    }

    public static <T> T[] getArr(T[] arr) {
        return arr;
    }

    public static <T> void printArray(T[] arr){

        if (arr != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i==arr.length - 1? "": ", ");
            }
            sb.append("]");
            System.out.println(sb);
        } else {
            System.out.println(arr);
        }
    }
}
