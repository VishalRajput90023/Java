//Exception Handling [ throw    throws    finally]
package test;
import java.util.Scanner;
public class thinkx {
	static void testthrow() throws NullPointerException{
		throw new NullPointerException("Null pointer demo!!");
	}
	public static void main(String[] args){	
		try{
		int a,b;
		System.out.println("Enter value a:");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		System.out.println("Enter value b:");
		b = scan.nextInt();
		System.out.println(a/b);
		   try {
		      int arr[] = {1,2,3,4};
		      arr[7] = 34;
	       	}
		   catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot access positiion 7"+e);
		   }	
		   throw new IllegalAccessException("demo");
		}catch(ArithmeticException e) {
			System.out.println("Value of b cannot be zero!!"+ e);
		}catch(IllegalAccessException e) {
			System.out.println("IllegalAccessException thrown explicitly my programmer");
		}
		//After all the try catch blocks have been executed
		finally {
			System.out.println("Final Run!!");
		}
		try {
		testthrow();
		}catch(NullPointerException ne) {
			System.out.println(ne);
		}
	}
}
