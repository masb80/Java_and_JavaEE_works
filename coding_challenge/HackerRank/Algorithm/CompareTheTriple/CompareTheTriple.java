package CompareTheTriple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CompareTheTriple {
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<>();
        int counta = 0;
        int countb = 0;
        if (a.size() >= 1 && b.size() >= 1 && a.size() <= 100 && b.size() <= 100) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) > b.get(i)) {
                    counta = counta + 1;
                }

                if (a.get(i) < b.get(i)) {
                    countb = countb + 1;
                }

            }
        }
        if (counta >= 0 && counta <= 100) {
            list.add(counta);
        }
        if (countb >= 0 && countb <= 100) {
            list.add(countb);
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //  List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
        //  .collect(toList());

        // List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
        //.collect(toList());
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 23, 33));
        List<Integer> b = new ArrayList<>(Arrays.asList(41, 2, 3));
        List<Integer> result = compareTriplets(a, b);
        // result.forEach(i -> System.out.print(i)+" ");
        // bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}