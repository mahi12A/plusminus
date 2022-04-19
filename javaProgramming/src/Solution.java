import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
   // ListIterator ltr = arr.listIterator();
    
    //while (ltr.hasNext())
    int l = arr.size();
    double p=0,n=0,z=0;
    
    for(int i=0; i<l;i++)
    {
        if(arr.get(i)<0)
        n++;
        
         if(arr.get(i)>0)
        p++;
        
         if(arr.get(i)==0)
        z++;
        
    }
    System.out.println(p/l);
    System.out.println(n/l);
    System.out.println(z/l);
        
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
