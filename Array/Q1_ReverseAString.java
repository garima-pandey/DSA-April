package Array;

public class Q1_ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Without using inbuilt function
		String name = "Garima";
		char arr[] = name.toCharArray();
		
		int i = 0;
		int j = arr.length - 1;
		
		while(i < j)
		{
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		for(char n : arr)
		{
			System.out.print(n);
		}		
	}

}
