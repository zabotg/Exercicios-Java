import java.util.Arrays;
import java.util.Scanner;

public class Sith_Anagram {
	
	public static void main(String[] args) {
		String s = "Tom Marvolo Riddle";
		String r = "I am LORD   Voldemort";
	
		System.out.println(areAnagrams(s, r));
		
	}

	static boolean areAnagrams(String word1, String word2){
		word1 = word1.replaceAll("\\s+", "");
		word2 = word2.replaceAll("\\s+", "");
		char[] palavra1 = word1.toLowerCase().toCharArray();
		char[] palavra2 = word2.toLowerCase().toCharArray();
		
		Arrays.sort(palavra1);
		Arrays.sort(palavra2);
		
		if(Arrays.equals(palavra1, palavra2)){
			return true;
		}
		return false;
	}
}