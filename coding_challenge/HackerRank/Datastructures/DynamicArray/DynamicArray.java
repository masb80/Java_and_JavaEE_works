package DynamicArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {
    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        ArrayList<ArrayList<Integer>> seqs=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp= new ArrayList<Integer>();
        int lastAns=0;

        for(int i=0;i<n;i++)
        {
            seqs.add(new ArrayList<Integer>());
        }

        for(List<Integer> arr: queries)
        {
            int seq=(arr.get(1)^lastAns)%n;

            int size=seqs.get(seq).size();

            switch(arr.get(0))
            {
                case 1: seqs.get(seq).add(arr.get(2));
                    break;

                case 2: lastAns= seqs.get(seq).get(arr.get(2)%size);
                    temp.add(lastAns);
            }
        }
        return temp;


    }

}

public class DynamicArray{
public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
        try {
        queries.add(
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList())
        );
        } catch (IOException ex) {
        throw new RuntimeException(ex);
        }
        });

        List<Integer> result = Result.dynamicArray(n, queries);

        bufferedWriter.write(
        result.stream()
        .map(Object::toString)
        .collect(Collectors.joining("\n"))
        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
        }
}