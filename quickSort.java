import java.util.Random;

public class quickSort {
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivotIndex = getPivot_First(array,low,high);
        int pivotValue = array[pivotIndex];


        swap(array, pivotIndex, high);

        int i = low;
        for (int j = low; j < high; j++) {
            if (array[j] >= pivotValue) {
                swap(array, i, j);
                i++;
            }
        }

        swap(array, i, high);
        return i;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int getPivot_MedianOfThree(int[] array, int low, int high) {
        int mid = low + (high - low) / 2;
        if (array[low] > array[mid]) {
            swap(array, low, mid);
        }
        if (array[low] > array[high]) {
            swap(array, low, high);
        }
        if (array[mid] > array[high]) {
            swap(array, mid, high);
        }
        return mid;
    }

    private static int getPivot_First(int[] array, int low, int high) {
        return low;
    }

    private static int getPivot_Last(int[] array, int low, int high) {
        return high;
    }

    private static int getPivot_Random(int[] array, int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        int array[] = {3,5,3,6,7,45,3,22,1,4,656,3};
        quickSort(array);
    }
}