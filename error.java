import java.util.Scanner;
class Error 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();
        try 
        {
            int y = a / (b + c);
            System.out.println("y: " + y);
        } catch (ArithmeticException e) 
        {
            System.out.println("Division by zero");
        } finally 
        {
            scanner.close();
        }
    }
}