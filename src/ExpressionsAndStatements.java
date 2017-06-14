import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpressionsAndStatements {

    public static String up(String arg) {
        return arg.toUpperCase();
    }

    public static void main(String... args) throws IOException {
        List<String> countries = Arrays.asList("Poland", "Germany", "France", "Italy");
        List<String> stringList = countries.stream().map(ExpressionsAndStatements::up).collect(Collectors.toList());
        System.out.print(stringList);

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test")));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.print(line);
        }
    }
}
