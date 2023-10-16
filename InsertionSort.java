public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;


            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        }

    public static void main(String[] args) {
        int array[] = {1,45,6,7,4,3,6,7,34,3,5,6,7,3};
        insertionSort(array);
    }
}
