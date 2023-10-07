/*Reverse a given array*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4,5,3,2};
        reverseArray(arr);
        System.out.print("The reversed array is: ");
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
    static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
