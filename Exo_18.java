public class Exo_18{
	public static void main(String[] args){
		int[] tableau = new int[10000];
		
		for(int i = 0; i < tableau.length; i++){
			tableau[i] = (int)(Math.random()*11);
		}
		
		int[] occurences = new int[11];
		for(int i = 0; i< tableau.length; i++){
			occurences[tableau[i]]++;
		}
		
		for(int i = 0; i< occurences.length; i++){
			System.out.println(i + " : " + occurences[i]);
		}
	}
}