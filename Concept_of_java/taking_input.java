import java.util.Scanner;


public class taking_input 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your name:");
        String name = sc.nextLine(); // String input  

        System.out.print("Enter you age:");
        int age = sc.nextInt();  //Integer input  
   

        System.out.println("Your name is "+name+" and you are "+age+" years old.");

        double height = sc.nextDouble();  // long integer input

        String ek_word = sc.next();      // One word input lena


        sc.close();   // Scanner object ko band karna (memory and OS resource clean up)
    }
    
}
