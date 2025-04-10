import java.util.Scanner;

public class FibonacciGenerator {
    public static void generatorFibonacci(int limit)
    {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence up to " + limit + ": ");
        while(a <= limit)
        {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit for Fibonacci sequence : ");
        int limit = sc.nextInt();
        if(limit < 0)
        {
            System.out.println("Please enter a non-negative number : ");
        }
        else {
            generatorFibonacci(limit);
        }
    }
}
