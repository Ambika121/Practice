
public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am Java Developer";
		int i,j;
		String str2 = "";
		j = -1;
		for(i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
				str2 = str2 + ' ';
			else
			{
				j++;
				if(str.charAt(str.length() -j -1)==' ')
					continue;
				else
				{
					str2 = str2 + str.charAt(str.length() -j -1);
				}
				    
			}
				
		}
		System.out.println(str2);

	}

}
