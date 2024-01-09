import java.util.Scanner;
public class PrintEven{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter ending number: ");
        int num2 = sc.nextInt();
        if(num1>num2)
        {
            System.out.println("Invalid range");
            return;
        }
        for(int i=num1;i<=num2;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}