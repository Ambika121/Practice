
public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int c;
		int count = 10;
		int i;
		for(i=0; i<count - 2; i++)
		{
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
