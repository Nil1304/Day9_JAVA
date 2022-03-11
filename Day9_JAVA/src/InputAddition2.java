import java.io.*;
public class InputAddition2 {
	
	//Using BufferedReader
	public static void main(String[] args) throws IOException {
		
		int num1,num2,add;
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		System.out.println("Enter your first number:");
		num1=Integer.parseInt(br.readLine());
		
		System.out.println("Enter your first number:");
		num2=Integer.parseInt(br.readLine());
		
		add=num1+num2;
		
		System.out.println("The addition of two number is: "+add);		
	}

}
