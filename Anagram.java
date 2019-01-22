
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[26];
		String str1 = "dog";
		String str2 = "gad";
		int i;
		for(i=0; i<str1.length(); i++)
		{
			arr[str1.charAt(i) - 97]++;
		}
		for(i=0; i<str2.length(); i++)
		{
			arr[str2.charAt(i) - 97]--;
		}
		for(i=0; i<26; i++)
		{
			if(arr[i]!=0)
			{
				System.out.println("Not Anagram");
				break;
			}			
		}
		if(i==26)
            System.out.println("Anagram");
	}

}
