import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> List = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> FinalList = new ArrayList();

        for (int i: List){
            if (i > 0 & i%2 == 0){
                FinalList.add(i);
            }
        }

        Collections.sort(FinalList);

        for (int i:FinalList) {
            System.out.println(i);
        }
    }
}