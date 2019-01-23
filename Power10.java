import java.lang.Math;

public class Power10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1000;
		int output;
		output = (int)(Math.log(number)/Math.log(10));
		
		if(Math.pow(10, output) == number)
			System.out.println("True");
		else
			System.out.println("False");

	}

}
