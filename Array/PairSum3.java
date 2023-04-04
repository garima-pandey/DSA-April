package Array;

public class PairSum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 9, 6, 3, 1, 10, 4};
		int sum = 9;
		
		int hash[] = new int[11];
		
		for(int i = 0; i < arr.length; i++)
		{
			int k = sum - arr[i]; //7
			
			if(hash[k] == 1)
			{
				System.out.println("Pair Sum is: "+arr[i]+" "+k);
				break;
			}
			
			hash[arr[i]] = 1;
		}

	}

}
