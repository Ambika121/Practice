
public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[26];
		String str = "The quick brown fox jumps over the lazy dog";
		int i;
		for(i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
				continue;
			else if(str.charAt(i) < 97)
				arr[str.charAt(i) - 65]++;
			else
			    arr[str.charAt(i) - 97]++;
		}
		for(i=0; i<26; i++)
		{
			if(arr[i]==0)
				System.out.println("Not Panagram");
		}
		if(i==26)
		{
			System.out.println("Panagram");
		}

	}

}
