
public class PanagramDet {
	
	static int arr[] = new int[26];
	
	static  void findMissingLetter(String str)
	{
		int i;
		
		for(i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
				continue;
			else if(str.charAt(i) < 97)
				arr[str.charAt(i) - 65] = 1;
			else
			    arr[str.charAt(i) - 97] = 1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog";
		int i;
		findMissingLetter(str);
		
		for(i=0; i<26; i++)
		{
			if(arr[i]==0)
				System.out.print((char)(i+97));
		}
	

	}

}
