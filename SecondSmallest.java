
public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {29, 15, 73, 76, 56, 46, 34, 23, 74, 36};
		int min = 0;
		int min2 = 0;
		int i;
		for(i = 0; i< 10; i++)
		{
			if(arr[i] < arr[min])
			{
				min = i;
			}
		}
		for(i = 0; i< 10; i++)
		{
			if(arr[i] < arr[min2] && i!=min)
			{
				min2 = i;
			}
		}
		System.out.println(arr[min2]);
	}

}
