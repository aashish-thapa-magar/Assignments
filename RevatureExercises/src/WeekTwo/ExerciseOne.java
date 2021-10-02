package WeekTwo;

public class ExerciseOne {

	public static void main(String[] args) {
		int a = 1;
		
		System.out.println("Odd Numbers 1 thru 9:");
		//Do while loop to print odd numbers thru 0 to 9.
		do{
		 	if (a % 2 != 0) 
		 	{
		 		System.out.println(a);
		 	}
		 	a++;
		}
		while(a < 10);
		
		char[] alph = getAlphabetArray();
		
	    for (int index = 0; index < alph.length; index++) {
			System.out.println(alph[index]);
		}
	}
	
	public static char[] getAlphabetArray() {
		//Array of characters.
		char[] alph = new char[26];
		char currentLetter = 'a';
		int index = 0;
		
		System.out.println("Array of characters:");
		
		do {
			alph[index] = currentLetter;   
			index++;
			currentLetter++;
		}
		while (index < alph.length && currentLetter <= 'z');
		
		return alph;
	}
}
	
