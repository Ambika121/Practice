
public class PascalTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int n=3, m=2;
		int[][] arr = new int[n][n];
		
		for(i=0; i<n; i++)
		{
			for(j=0; j<i+1; j++)
			{
				if(j==0 || i==j)
				{
					arr[i][j] = 1;
				}
				else
				{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		System.out.println(arr[n-1][m-1]);
	}

}
