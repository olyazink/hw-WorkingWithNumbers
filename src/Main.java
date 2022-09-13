import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        intList.removeIf(value -> value <= 0);
        intList.removeIf(value -> value % 2 != 0);
        intList.sort(Integer::compareTo);
        System.out.println(intList);
    }
}