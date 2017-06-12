package mine.sorting;

/**
 * Created by murumkah on 6/1/2017.
 */
public class SelectionSort {
    public static void main(String[] args) {

        int[] input = {14, 22, 0, 21, 4, 19, 16};
        sort(input);
    }


    private static void sort(int[] input)
    {
        int min, j, lastMinIndex;
        for (int i = 0; i < input.length; i++)
        {
            min = input[i];
            j = i+1;
            lastMinIndex = -1;
            while(j < input.length)
            {
                if(input[j] < min) {
                    min = input[j];
                    lastMinIndex = j;
                }

                j++;
            }

            if(lastMinIndex > -1) {
                input[lastMinIndex] = input[i];
                input[i] = min;
            }
        }

        for (int num: input)
        {
            System.out.println(num);
        }
    }
}
