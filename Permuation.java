// Java program to print all permutations of a
// given string.
public class Main
{
	public static void main(String[] args)
	{
		String s = "ABC";
		int len = s.length();
		
		permute(s, 0, len-1);
	}

	// Make a permuate function to calcuate all posible permuation of palindrom of string 
	public static  void permute(String s, int l, int r)
	{
		if (l == r)
			System.out.println(s);
		else
		{
			for (int i = l; i <= r; i++)
			{
				s = swap(s,l,i);
				permute(s, l+1, r);
				s = swap(s,l,i);
			}
		}
	}

//swapping of value of character at L position with character at r Position 
	public static String swap(String s, int i, int j)
	{
		char temp;
		char[] charArray = s.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}

// This code is contributed by Vipin Pandey
