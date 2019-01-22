
public class LongestOccuChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbbbbcc";
		int arr[] = new int[26];
		int i;
		
		for(i=0 ;i< str.length(); i++)
		{
			arr[str.charAt(i) - 97]++;
		}
		int max = 0;
		for(i=0; i<26; i++)
		{
			if(arr[i] > arr[max])
			{
				max = i;
			}
		}
		
		System.out.println("Highest occuring is " + (char)(max+97));

	}

}
