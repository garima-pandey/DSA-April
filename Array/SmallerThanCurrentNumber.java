package Array;

public class SmallerThanCurrentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {8, 1, 2, 2, 3};
//		o/p: 4, 0, 1, 1, 3
		
		int count = 0;
		int output[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++)
		{
			count = 0;
			
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					count++;
				}
			}
			
			output[i] = count;
		}
		
		System.out.println("Array:");
		for(int i : output)
		{
			System.out.print(i+" ");
		}
	}

}
