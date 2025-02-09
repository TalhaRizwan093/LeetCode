import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> strings = List.of("","   ","!@#$%^&*()_+","LongStringWithNoSpaces","Another, String With, Commas");
//        strings.add("World");
//        strings.add("2#");

        System.out.println(strings);

        Solution solution = new Solution();
        String encodedString = solution.encode(strings);
        System.out.println(encodedString);
        System.out.println(solution.decode(encodedString));

    }
}