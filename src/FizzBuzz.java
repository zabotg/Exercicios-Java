public class FizzBuzz {
	
	public static void main(String[] args) {
		
		printFizzBuzz();
		
	}
	
	static void printFizzBuzz(){
		int mul3 = 0;
		int mul5 = 0;
		
		for(int i = 1; i <= 100; i++) {
			mul3 = i % 3;
			mul5 = i% 5;
			
			if(mul3 == 0){
				if(mul5 == 0){
					System.out.println("FizzBuzz");
				} else
					System.out.println("Fizz");
			}else if(mul5 == 0){
				System.out.println("Buzz");
			} else
				System.out.println(i);
		}
	}
}