package Assignment;

import java.util.Scanner;

public class gradeExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		if(marks < 50)
			System.out.println("Fail!");
		else if(marks < 60)
			System.out.println("Pass");
		else if(marks < 75)
			System.out.println("First Class");
		else
			System.out.println("Distinction");
		
		sc.close();

	}

}
