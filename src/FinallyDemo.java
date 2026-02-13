import java.util.Scanner;

public class FinallyDemo {
    
        // TODO: Read a and b
        
        // TODO: try block
        // Perform division
        // Print "Result: " + result
        
        // TODO: catch ArithmeticException e
        // Print "Error: " + e.getMessage()
        
        // TODO: finally block
        // Print "Finally block executed"

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int a= sc.nextInt();
		int b= sc.nextInt();

		try{

			int result=a/b;
			System.out.println(result);

		}
		catch(ArithmeticException e){

			System.out.println("Error: "+e.getMessage());

		}
		finally{

			System.out.println("Finally block executed");

		}
		sc.close();

	}
}
