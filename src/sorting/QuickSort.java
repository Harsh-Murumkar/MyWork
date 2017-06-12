package mine.sorting;

/**
 * Created by murumkah on 5/24/2017.
 */
public class QuickSort {

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = {14, 22, 0, 21, 4, 19, 16, 2, 11};

        int low = 0, high = arr.length-1;

        qs.sort(arr, low, high);

        for (Integer num : arr)
        {
            System.out.println(num + " ");
        }
    }

    private int partition(int []arr, int low, int high)
    {
        int i = low-1, temp = 0;

        for (int j = low; j <= high-1; j++)
        {
            if(arr[j] <= arr[high])
            {
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    private void sort(int[] arr, int low, int high)
    {
        if(low < high) {
            int pi = partition(arr, low, high);
            //System.out.println("low : " + low + " high : " + high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}
