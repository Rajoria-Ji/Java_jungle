import java.util.Scanner;

public class input_Example{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name:");
        String name = sc.nextLine(); // taking input in string

        System.out.print("Enter the age:");
        int age = sc.nextInt();      // taking input in integer

        System.out.println(name+", Your age is "+age);
        sc.close();
    }
    
}
