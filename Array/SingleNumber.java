package Array;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Single Number: Odd no of times occur in our array
		
		int arr[] = {1, 1, 1, 2, 2, 5, 5};
		
		//Approach - 2: Optimized Approach
		// X - OR (Exclusive - OR): ^
		
//		0		1		0		1
//		0		1		1		0
//		0		0		1		1
		
		int result = 0;
		for(int i = 0; i < arr.length; i++)
		{
			result = result ^ arr[i];
		}
		
		System.out.println("Single Number is: "+result);
		
		// Approach - 1
//		int count = 0;
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr.length; j++)
//			{
//				if(arr[i] == arr[j])
//				{
//					count++;
//				}
//			}
//			if((count % 2) != 0) {
//				System.out.println("Single Number is: "+arr[i]);
//				System.exit(0);
//			}
//		}

	}

}
