
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 36;
		int i;
		
		for(i=2; i<num/2; i++)
		{
			while(num%i==0)
			{
				
					System.out.println(i + " ");
					num = num/i;
			}
		}

	}

}
