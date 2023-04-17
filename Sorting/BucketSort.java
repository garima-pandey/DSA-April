package Sorting;

public class BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 2, 1, 4, 3, 1};
		int hash[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++)
		{
			hash[arr[i]]++;
		}
		
		for(int i = 0, j = 0; i < arr.length; i++)
		{
			while(hash[i] > 0)
			{
				arr[j++] = i;
				hash[i]--;
			}
		}
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}
