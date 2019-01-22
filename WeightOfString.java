
public class WeightOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "apple";
		int i;
		int sum = 0;
		for(i=0; i<str.length(); i++)
		{
			sum = sum + (int)str.charAt(i) - 96;
			
		}
		System.out.println(sum);

	}

}
