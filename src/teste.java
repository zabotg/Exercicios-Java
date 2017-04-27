
public class teste {

	public static void main(String[] args) {
		String abc = "Guilherme Felipe Zabot";
		
		abc = abc.trim();
		
		abc = abc.replaceAll("\\s+", "").toLowerCase();
		
		System.out.println(abc);
	}
}
