public class Main {
    public static void main(String[] args)
    {
        int count=0;
        int[] marks = {15, 50, 30, 2};
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] % 2 == 0) {
                count=count+1;
            }}
        System.out.println(count);
    }
}