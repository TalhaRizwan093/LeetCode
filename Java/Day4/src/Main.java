import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,4};
        int k = 2;

        int[] res = Prob347.solve(nums,k);
        System.out.println(Arrays.toString(res));

    }
}