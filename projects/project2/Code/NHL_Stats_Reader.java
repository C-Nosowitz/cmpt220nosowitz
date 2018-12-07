import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.lang.model.element.Element;
import org.jsoup.*;

public class NHL_Stats_Reader {    
    public static void main(String[] args) throws Exception{
    	try {
    		Scanner input = new Scanner(System.in);
    		System.out.print("Enter a player's LAST name: ");
    		String user_input = input.next();
    		System.out.println();    				
	    	org.jsoup.nodes.Document doc = Jsoup.connect("https://www.nhl.com/islanders/stats").get();	    	
			org.jsoup.select.Elements rows = doc.select("tr");
			System.out.print("#       Name            Pos.    GP      G       A       Pts.    PIM    +/-      Birthdate       Age     Birthplace      Hght   Wght");
			System.out.print("\n");
			for(org.jsoup.nodes.Element row :rows) {        	
				org.jsoup.select.Elements columns = row.select("td");
				for (org.jsoup.nodes.Element column:columns) { 
					BufferedWriter names = null;
					names = new BufferedWriter(new FileWriter("names.txt"));
					names.write(doc.text() + "\n");				
					names.close();			
        		}
    		}

		BufferedReader display = new BufferedReader(new FileReader("names.txt"));
		String st;
		String list = null;		
		while ((st = display.readLine()) != null) {
			list = st;
		}		
		StringTokenizer str = new StringTokenizer(list);		
		ArrayList<String> str_arr = new ArrayList<String>();
		while (str.hasMoreTokens()) {
			str_arr.add(str.nextToken());			
		}		
		for(int j = 0, pos = 15; j < str_arr.size() - 2; j++, pos++) {
			
			String current_str = str_arr.get(j + 2);
			String final_str = str_arr.get(pos - j);
			if (current_str.equals(user_input)) {
				for (int f = j; f <= pos; f++) 
					System.out.print(str_arr.get(f) + "\t");
			}			
		}    		
			display.close();		
	}    	
    	catch (IOException e) {
    		e.printStackTrace();
    	}
    }
}
 
        



