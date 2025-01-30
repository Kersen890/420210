public class Exo_17{
	public static void main(String[] args){
		char[] tableau = {'a','b','e','f','i','o','u','p'};
		int voyelle = 0;
		
		for(int i = 0; i < tableau.length; i++){
			if(tableau[i] == 'a'|| tableau[i] == 'e'|| tableau[i] == 'i'|| tableau[i] == 'o'|| tableau[i] == 'u'|| tableau[i] == 'y'){
				voyelle++;
			}
		}
		
		System.out.println("Il y a " + voyelle + " dans le tableau.");
	}
}