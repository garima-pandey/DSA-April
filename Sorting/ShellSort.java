package Sorting;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5, 4, 3, 2, 1};
		int s = (arr.length) / 2;
		
		while(s > 0)
		{
			for(int i = s; i < arr.length; i++)
			{
//				for(int j = i + s; j < arr.length; j++)
				for(int j = i - s; j >= 0; j = j - s)// j = 1
				{
					if(arr[j] > arr[j + s])
					{
						int temp = arr[j];
						arr[j] = arr[j + s];
						arr[j + s] = temp;
					}
				}
			}
			
			s = s/2;
		}
		
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
		
	}

}
