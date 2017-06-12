package mine.sorting;

/**
 * Created by murumkah on 6/1/2017.
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] input = {14, 22, 0, 21, 4, 19, 16};
        sort(input);
    }

    private static void sort(int[] input)
    {
        int element, j;
        for(int i = 1; i < input.length; i++)
        {
            element = input[i];
            j = i;
            while(j > 0 && element < input[j-1])
            {
                input[j] = input[j-1];
                j--;
            }

            input[j] = element;
        }

        for (int num : input)
        {
            System.out.println(num);
        }
    }

}
