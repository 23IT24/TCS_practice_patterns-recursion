import java.util.Scanner;
public class Factorial_recursion {
    static int factorial(int n){
         if(n==1){
            return 1;
         }else{
            return n*factorial(n-1);
         }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();

        System.out.println("Factorial of a given number is: "+factorial(n));
    }
}
