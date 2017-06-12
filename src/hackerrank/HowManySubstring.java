package hackerrank;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by murumkah on 6/7/2017.
 */
public class HowManySubstring {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String s = in.next();
        for(int a0 = 0; a0 < q; a0++){
            int left = in.nextInt();
            int right = in.nextInt();
            findAllSubsstrings(s, left, right);
        }
    }

    private static void findAllSubsstrings(String s, int left, int right)
    {
        String subStr = "";
        if(left == right)
            subStr = s.substring(left-1, right);
        else
         subStr = s.substring(left, right);
        for(int i = 0; i < subStr.length(); i++)
        {
            for (int j = i+1; j < subStr.length(); j++)
            {
                System.out.println(subStr.substring(i, j));
            }
        }

    }

}


