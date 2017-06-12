package mine.sorting;

/**
 * Created by murumkah on 6/2/2017.
 */
public class MergeSort {

    public static void main(String[] args) {
        int [] input = {14, 22, 0};//, 21, 4, 19, 16, 2, 11};
        int[] output = new int[input.length];

        sort(input);

        for(int num:input)
        {
            System.out.println(num);
        }

    }

    private static void sort(int[] input) {
        if(input.length > 1)
        {
            int mid = input.length/2;
            int[] leftArr = new int[mid], rightArr = new int[input.length-mid];

            for(int i = 0; i < leftArr.length; i++)
                leftArr[i] = input[i];
            for(int i = 0; i < rightArr.length; i++)
                rightArr[i] = input[mid + i];

            sort(leftArr);
            sort(rightArr);
            merge(leftArr, rightArr, input);
        }
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] input) {
        int i = 0, j = 0, k = 0;
        while(i < leftArr.length && j < rightArr.length)
        {
            if(leftArr[i] <= rightArr[j]) {
                input[k] = leftArr[i];
                i++;
            }else
            {
                input[k] = rightArr[j];
                j++;
            }

            k++;
        }

        while(i < leftArr.length)
        {
            input[k] = leftArr[i];
            k++;
            i++;
        }

        while(j < rightArr.length)
        {
            input[k] = rightArr[i];
            k++;
            j++;
        }
    }


}
