package mine.sorting;

/**
 * Created by murumkah on 6/2/2017.
 */
public class Bubble {
    public static void main(String[] args) {

        int[] input = {14, 22, 0, 21, 4, 19, 16, 2, 11};
        int tmp;
        for(int i = 0; i < input.length; i++)
        {
            for(int j = i; j < input.length; j++)
            {
                tmp = input[i];
                if(input[j] < input[i])
                {
                    tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
            }
        }

        for (int num:input) {
            System.out.println(num);
        }
    }
}
