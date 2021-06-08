package Exercise;
import java.util.*;
public class Anagram {
	
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		String string1 = scan.nextLine().toLowerCase();
		String string2 = scan.nextLine().toLowerCase();
		if(isAnagram(string1,string2))
		{
			System.out.println("Anagrams");
		}
		else
		{
		    System.out.println("Not Anagrams");
		}
		scan.close();
		
	}
	//method to check if two strings are anagrams
	
	static boolean isAnagram(String string1, String string2) {
		
		//check for the lengths
		
	    if (string1.length() != string2.length())
	    {
	        return false;
	    }
	    char[] a1 = string1.toCharArray();
	    char[] a2 = string2.toCharArray();
	    //sorting 
	    Arrays.sort(a1);
	    Arrays.sort(a2);
	    return Arrays.equals(a1, a2);
	}
}
