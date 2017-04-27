
public class HoldTheDoor {

	public static void main(String[] args) {
		int hodorStrength = 100;
		int[] doorsStrength = {25,30,12};
		int[] zombiesInflux = {4,3,4};
		
		int result = holdTheDoor(hodorStrength, doorsStrength, zombiesInflux);
		System.out.println(result);
		
	}
	
	static int holdTheDoor(int hodorStrength, int[] doorsStrength, int[] zombiesInflux){
		float max = 0;
		int porta = 0;
		for(int i = 0; i < doorsStrength.length; i++){
			float aux = (hodorStrength + doorsStrength[i]) / zombiesInflux[i];
			if(aux > max){
				max = aux;
				porta = i;
			}
		}
		return porta;
	}
	
}
