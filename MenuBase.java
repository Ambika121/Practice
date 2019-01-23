package Assignment;

import java.util.Scanner;

public class MenuBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		int num;
		double result = 0;
		
		while(true)
		{
			System.out.println("Enter your Choice\n1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\n5:Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			    case 1: System.out.println("Enter number to Add");
			            num = sc.nextInt();
			            result = result + num;
			            break;
			    case 2: System.out.println("Enter number to Sub");
	                    num = sc.nextInt();
	                    result = result - num;
	                    break;
			    case 3: System.out.println("Enter number to mul");
	                    num = sc.nextInt();
	                    result = result * num;
	                    break;
			    case 4: System.out.println("Enter number to div");
	                    num = sc.nextInt();
	                    result = result / num;
	                    break;
			    case 5: System.exit(0);
			   default: System.out.println("Wrong Choice");
			}
			System.out.println(result);
		}

	}

}
