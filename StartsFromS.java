
public class StartsFromS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"apple", "sample", "search", "cat"};
		int i;
		for(i=0; i<str.length; i++)
		{
			if(str[i].charAt(0)=='S' || str[i].charAt(0)=='s')
			{
				System.out.println(str[i]);
			}
		}

	}

}
