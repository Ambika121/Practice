
import java.lang.Math;

public class Power5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		int output;
		output = (int)(Math.log(number)/Math.log(5));
		
		if(Math.pow(5, output) == number)
			System.out.println("True");
		else
			System.out.println("False");

	}

}
