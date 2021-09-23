package array;

public class CharArrayTest {

	public static void main(String[] args) {

	
		char[] alpahbets = new char[26];
		
		//³»°¡ Ç¬ °Å
		/*for(int i=0; i<alpahbets.length; i++) {
			alpahbets[i] =  (char)(65+i);
			System.out.println(alpahbets[i]);
		}*/

		
		char ch ='A';
		for(int i=0; i<alpahbets.length; i++) {
			alpahbets[i] = ch++;
		}
		
		for(int i=0; i<alpahbets.length; i++) {
			System.out.println(alpahbets[i]+","+(int)alpahbets[i]);
		}
	}

}
