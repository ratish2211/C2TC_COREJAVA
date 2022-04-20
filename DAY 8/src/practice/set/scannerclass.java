package practice.set;
import java.util.Scanner;
public class scannerclass {

	public static void main(String[] args) {
		
		System.out.println ("Enter your mobile number");
	    try (Scanner sc=new Scanner (System.in)){
	    long x;
	    x=sc.nextLong ();//895545555
	    System.out.println ("Entered number is "+x);
	    }
	}

}
