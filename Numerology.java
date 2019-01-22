
public class Numerology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "S. KANAPATHY";
		int i;
		int sum = 0;
		for(i=0; i<str.length(); i++)
		{
			switch(str.charAt(i))
			{
			case 'A':
			case 'I':
			case 'J':
			case 'Q':
			case 'Y': sum = sum + 1; break;
			
			case 'B':
			case 'K':
			case 'R': sum = sum + 2; break;
			
			case 'C':
			case 'G':
			case 'L':
			case 'S': sum = sum + 3; break;
			
			case 'D':
			case 'M':
			case 'T': sum = sum + 4; break;
			
			case 'E':
			case 'H':
			case 'N':
			case 'X': sum = sum + 5; break;
			
			case 'U':
			case 'V':
			case 'W': sum = sum + 6; break;
			
			case 'O':
			case 'Z': sum = sum + 7; break;
			
			case 'F':
			case 'P': sum = sum + 8; break;
			}
		}
		while(sum>9)
		{
			int num = sum;
			sum = 0;
			while(num>0)
			{
				int rem = num%10;
				sum = sum + rem;
			    num = num/10;
			}	
		}
		System.out.println(sum);

	}

}
