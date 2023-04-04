package Array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "AAABBCCCDD";
		char arr[] = str.toCharArray();
		
		// '\0'
		
		char prev = '\0';
		int i = 0;
		
		for(char ch : arr)
		{
			if(prev != ch)
			{
				arr[i++] = ch;
				prev = ch;
			}
		}
		
		str = new String(arr).substring(0, i);
		
		System.out.println(str);
	}

}
