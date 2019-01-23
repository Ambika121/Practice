
public class StringMani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbbbbcccd";
		int arr[] = new int[26];
		int i;
		
		for(i=0; i<str.length(); i++)
		{
			if(str.charAt(i) > 65 && str.charAt(i) < 97)
			    arr[str.charAt(i) - 65]++;
			else
				arr[str.charAt(i) - 97]++;
		}
		
		for(i=0; i<str.length(); i++)
		{
			if(arr[i]>0)
			    System.out.println((char)(i+97) + " = " + arr[i]);
		}

	}

}
