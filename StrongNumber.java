
public class StrongNumber {
	
	static int fact(int n)
	{
		int i;
		int fact = 1;
		for(i=1; i<=n; i++)
		{
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 145;
		int num = number;
		int remainder;
		int sum = 0;
		
		while(num>0)
		{
			remainder = num % 10;
			sum = sum + fact(remainder);
			num = num/10;
		}
		
		if(sum==number)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}

}
