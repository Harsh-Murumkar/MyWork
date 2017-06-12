package hackerrank;

import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * Created by murumkah on 6/6/2017.
 */
public class Gemstones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfInputs = scanner.nextInt();
        Set<Character> charMapper = new HashSet();

        for(int index = 0; index < noOfInputs; index++)
        {
            charMapper = analyzeGemStoneString(scanner.next(), charMapper);
        }

        System.out.println(charMapper.size());

    }

    private static Set<Character> analyzeGemStoneString(String s, Set<Character> mapper)
    {
        char[] arr = s.toCharArray();
        boolean isMapperEmpty = mapper.isEmpty();
        Set<Character> returnSet = isMapperEmpty == false ? new HashSet<>() : null;
        for(int i = 0; i < arr.length; i++)
        {
            Character c = Character.valueOf(arr[i]);

            if(isMapperEmpty)
                mapper.add(c);
            else if(mapper.contains(c))
                returnSet.add(c);
        }

        return returnSet == null ? mapper : returnSet;
    }
}
