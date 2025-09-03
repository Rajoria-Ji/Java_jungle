import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        if(number%2==0)
        {
            System.out.print(number+" is even");
        }
        else{
            System.out.print(number+" is odd");
        }
        sc.close();
    }
    
}
