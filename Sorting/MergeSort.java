package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11, 22, 44, 33, 11, 66, 55, 88, 77};
		int n = arr.length;
		int temp[] = new int[n];
		
		for(int size = 1; size < n; size = size * 2)
		{
			int l1 = 0;
			int k = 0; // index for temp array
			
			while(l1 + size < n) // 3 < 9
			{
				int h1 = l1 + size - 1; // 0 + 1 - 1 = 0, 2
				int l2 = h1 + 1; // 1, 3
				int h2 = l2 + size - 1; // 1, 3
				
				if(h2 >= n)
				{
					h2 = n - 1; // 8
				}
				
				//merge two arrays
				
				int i = l1;// 0, 2, 
				int j = l2;// 1, 3,
				
				//arr: 11, 22, 44, 33, 11, 66, 55, 88, 77
				
				//temp: 11, 22, 33, 44, 11, 66, 55, 88, 77
				
				while(i <= h1 && j <= h2)
				{
					if(arr[i] <= arr[j])// 11 < 22, 44 < 33
					{
						temp[k++] = arr[i++]; // k = 1, i = 1
					}
					else {
						temp[k++] = arr[j++];// k = 3, j = 4
					}
				}
				
				while(i <= h1)// 2 <= 2
				{
					temp[k++] = arr[i++]; // k = 4, i = 3
				}
				
				while(j <= h2)// 0 <= 0
				{
					temp[k++] = arr[j++]; // k = 2, j = 1
				}	
				
				// merge completed
				
				l1 = h2 + 1; // 2, 4
			}
			
			//any pair left
			for(int i = l1; i < n; i++)
			{
				temp[k++] = arr[i];
			}
			
			for(int i = 0; i < n; i++)
			{
				arr[i] = temp[i];
			}
			
			System.out.println("\nSize of "+size+" elements are:");
			for(int i = 0; i < n; i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
