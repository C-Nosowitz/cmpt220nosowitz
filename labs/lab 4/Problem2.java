
public class Problem2 {

	public static void main(String[] args) {
		char[] chars = createArray(); 
		
		System.out.println("The lowercase letters are:"); 
		displayArray(chars); 
}
	public static char[] createArray() {  
		 char[] chars = new char[25]; 
		 for (int i = 0; i < chars.length; i++)         
			 chars[i] = RandomCharacter.getRandomLowerCaseLetter(); 
		 return chars; 
	}
	public static void displayArray(char[] chars) { 
		for (int i = 0; i < chars.length; i++) { 
			if ((i + 1) % 5 == 0)          
				System.out.println(chars[i]); 
			else           
				System.out.print(chars[i] + " ");      
			}    
		} 
}
