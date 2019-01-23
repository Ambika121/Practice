import java.lang.Math;

public class Power2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1024;
		int output;
		output = (int)(Math.log(number)/Math.log(2));
		
		if(Math.pow(2, output) == number)
			System.out.println("True");
		else
			System.out.println("False");

	}

}
