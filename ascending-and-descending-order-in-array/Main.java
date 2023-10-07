import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {10,5,3,11,17,1,12};
        // Sorting in ascending order
        Arrays.sort(arr);
        System.out.println("Ascending Order: " + Arrays.toString(arr));
        // Sorting in descending order
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Descending Order: " + Arrays.toString(arr));
    }
}
