//Q. Gives 2 if the index value of array is even else 1.
import java.util.Arrays;

public class Arraycheck {
    public static void main(String[] args) {
        int[] marks = {15, 50, 30, 2};
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] % 2 == 0) {
                marks[i] = 2;
            } else {
                marks[i] = 1;
            }
        }
        System.out.println(Arrays.toString(marks));
    }
}