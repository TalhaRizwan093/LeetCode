import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PascalTriangle {
    public static void solve(int len){
        List pascalTriangle = new ArrayList<>();
        pascalTriangle.add(new ArrayList<>(List.of(1)));
//        pascalTriangle.add(new ArrayList<>(List.of(1, 1)));

        List prev = (List) pascalTriangle.get(0);
        int prevVal = 0;

        for (int i = 1; i < len; i++) {
            List currentRow = new ArrayList<>();
            for (int j = 0; j < i + 1 ; j++) {
                if(j == 0 || j == i){
                    currentRow.add(1);
                }else{
                    int sol = (int)prev.get(j-1) + (int)prev.get(j);
                    currentRow.add(sol);
                }
            }
            pascalTriangle.add(currentRow);
            prev = (List) currentRow;
        }
        System.out.println(pascalTriangle);

    }
}
