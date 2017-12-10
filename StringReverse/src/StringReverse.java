
public class StringReverse {

	public static void main(String[] args)
	{
		//String to be reversed
		String test = "reversethis";
		
		//displaying the result of the reverse function
		System.out.println(reverse(test));
	}
	
	//defining the function that will reverse the text
	public static String reverse(String s)
	{
		//string to diplay the reversed text
		String finalString="";
		
		//loop beginning from the end of the word given in parameter so the last character is added in first
		//position etc..
		for (int i = s.length()-1; i >= 0 ; i--) 
		{
			finalString+=s.charAt(i);
		}
		//returning our reversed string 
		return finalString;
	}

}
