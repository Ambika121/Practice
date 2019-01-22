
public class DiffGivStrInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Online test with GS client";
		int arr[] = new int[26];
		int i;
		
		for(i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
				i++;
			if(str.charAt(i) < 97)
				arr[str.charAt(i) - 65] = 1;
			else
			    arr[str.charAt(i) - 97] = 1;
		}
		for(i=0; i<26; i++)
		{
			if(arr[i]==0)
			{
				System.out.println((char)(i+97)+ " ");
			}
		}

	}

}
