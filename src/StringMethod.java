
public class StringMethod {

	//string to capitalize the first letter of a String
	public static String capitalize(String word) {
		//declare a temp string to collect data
		String word2 = "";
		
		//test casing for all letters
		for (int i = 0; i < word.length(); i++) {
			if (i == 0) {
				word2 = word.substring(i, (i + 1)).toUpperCase();
				continue;
			} else if (i <= word.length())
				word2 += word.substring(i, (i + 1)).toLowerCase();
		}

		return word2;
	}

	//Method to search for a a term within a string
	public static int wheresWaldo(String phrase) {
		return phrase.indexOf("Waldo");
	}
	
	//Method to check which string is alphabetically first
	public static String firstThingsFirst(String a, String b) {
		//get diff between strings
		int compareValue = a.compareToIgnoreCase(b);
		
		//test which is bigger
		if (compareValue < 0)
		{
			return a + " " + b;
		}else if (compareValue > 0) {
			return b + " " + a;
		}else {
			return "Equal";
		}
	}
	
	//Method to reverse the data in a string
	public static String reverse(String s) {
		
		//use temp variable to reverse letters
		String temp2 = "";
				
		for(int i = s.length()-1; i >= 0; i--)
		{
			
			temp2 += s.charAt(i);
			
		}
		
		return temp2;
	}
	
	//Method to determine which string is longer
	public static String soLong(String a, String b) {
		//test string lengths to each out
		if(a.length() > b.length())
		{
			return a;
		}else if (b.length() > a.length()) {
			return b;
		}else {
			return(a + " " + b);
		}		
			
	}
	
	//Method to check if math exists in a string
	public static String afterMath(String phrase) {
		//assign variable to find position of math
		int where = phrase.indexOf("math");
		//check if position exists
		if(where >= 0)
		{
			return phrase.substring(where);
		}else {
			return "dud";
		}
	}
	
	//Method to print String to characters on a single line
	public static void letterize(String word) {
		
		//cycle through String and print characters
		for(int i = 0; i < word.length(); i++) {
			
			System.out.println(word.charAt(i));
		}
	}
	
	//Method to convert string sentence to single camel case 
	public static String camalCase(String phrase) {
		
		StringBuffer tempString = new StringBuffer();//temp variable to build string
		String returnValue = ""; //return value
		int holder = 0; //hold the last letter position
		int start = 0;//initialize starting position
		
		phrase = phrase.toLowerCase();
		
		//find first space position
		holder = phrase.indexOf(' ');
		//add to temp variable
		tempString.append(phrase.substring(start, holder));						
		
		//loop until last character of string
		while(holder < phrase.length())
		{
			//change position of starting point
			start = holder + 1;
			
			//test for last space to prevent from going out of bounds
			if(phrase.indexOf(' ', start) < 0)
			{
				holder= phrase.length();
				
			}else {
				holder = phrase.indexOf(' ', start);
			}		
			
			//Change first character to uppercase and add to temp variable
			tempString.append(phrase.substring(start, start+1).toUpperCase());
			//add rest of current word to temp variable
			tempString.append(phrase.substring(start+1, holder));
				
		}
		
		//assign return value from temp variable
		returnValue = tempString.toString();
		//return variable
		
		return returnValue;
	}
	
}
