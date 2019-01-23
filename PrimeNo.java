package Assignment;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i;
		
		for(i=2; i<=Math.sqrt(num); i++)
		{
			if(num%i==0)
			{
				System.out.println("Not a prime Number");
				sc.close();
				System.exit(0);
			}
		}
		System.out.println("Prime Number");
		sc.close();

	}

}
