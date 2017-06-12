package hackerrank;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by murumkah on 6/6/2017.
 */
public class FunnyString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfInputs = scanner.nextInt();

        for(int index = 0; index < noOfInputs; index++)
        {
            analyzeFunnyString(scanner.next());
        }

    }

    private static void analyzeFunnyString(String s)
    {
        char[] charArr = s.toCharArray();

        String r = findReverse(charArr);
        char[] revCharArr = r.toCharArray();

        boolean isFunny = false;

        for(int i = 1; i < charArr.length; i++)
        {
            if(Math.abs(charArr[i] - charArr[i-1]) == Math.abs(revCharArr[i] - revCharArr[i-1]))
            {
                isFunny = true;
                continue;
            }
            else
            {
                isFunny = false;
                break;
            }
        }

        System.out.println(isFunny ? "Funny" : "Not Funny");
    }

    private static String findReverse(char[] arr) {
        StringBuilder builder = new StringBuilder();
        if(arr != null)
        {
            Stack<Character> stack = new Stack();
            for(char c : arr)
            {
                stack.add(c);
            }

            while(!stack.isEmpty())
            {

                builder.append(stack.pop());
            }
        }

        return builder.toString();
    }
}
