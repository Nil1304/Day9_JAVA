import java.util.Scanner;
public class InputAddition1 {

	//using Scanner class
	public static void main(String[] args) {
		
		int num1,num2,add;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		num1=s.nextInt();
		
		System.out.println("Enter second number:");
		num2=s.nextInt();

		add=num1+num2;
		
		System.out.println("The addition of two number is: "+add);		
	}

}
