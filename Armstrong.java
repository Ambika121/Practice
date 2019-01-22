
public class Armstrong {
	
	public static void main(String[] args)
	{
		int number = 371;
		int num = number;
		int len = 0;
		int remainder;
		int sum = 0;
		while(num>0)
		{
			len++;
			num = num / 10;
		}
		
		num = number;
		while(num>0)
		{
			remainder = num % 10;
			sum = (int) (sum + Math.pow(remainder, len));
			num = num / 10;
		}
		
		if(number == sum)
		{
			System.out.println("Armstrong");
		}
		else
			System.out.println("Not Armstrong");
	}

}
