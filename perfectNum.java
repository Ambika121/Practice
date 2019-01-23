
public class perfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 25;
		int sum = 0;
		int i;
		
		for(i=1; i<=num/2; i++)
		{
			if(num%i == 0)
			{
				sum = sum + i;
			}
		}
		if(sum == num)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not Perfect");
		}

	}

}
