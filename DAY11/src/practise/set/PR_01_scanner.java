package practise.set;
import java.util.Scanner;
public class PR_01_scanner {
	public static void main(String[]args) {
	System.out.println("Taking Input From the User");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1 ");
    int a = sc.nextInt();
    //float a = sc.nextFloat();
    System.out.println("Enter number 2 ");
    int b = sc.nextInt();
   //float b = sc.nextFloat();
   
    int sum = a +b;
    System.out.println("The sum of these numbers is ");
    System.out.println(sum);
   
   
   
   
}
}