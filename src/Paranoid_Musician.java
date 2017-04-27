import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Paranoid_Musician {
	
	public static void main(String[] args) {
		int[] notes = {1, 2, 3, 2, 2, 1, 5, 5};
		
		int[] result = getRareNotes(notes);
		
		System.out.println(Arrays.toString(result));
		
	}
	
	static int[] getRareNotes(int[] notes){
		ArrayList<Integer> listaux = new ArrayList<>();
		int count;
		
		for(int i = 0; i < notes.length; i++){
			count = 0;
			for (int j = 0; j < notes.length; j++) {
				if(notes[i] == notes[j]){
					count++;
				}
			}
			if(count == 1){
				listaux.add(notes[i]);
			}
		}
		
		notes = new int[listaux.size()];
		
		for (int i = 0; i < listaux.size(); i++) {
			notes[i] = listaux.get(i);
		}
		
		return notes;
	}
}

