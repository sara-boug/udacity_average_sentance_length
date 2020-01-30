import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class background_methods {
 public String help = "  Make sure to precise the current path of the relative path not the absolute one!\n"
 		+ "  start by -d : to precise phrases delimitation\n "
 		+ "  w/-l : to precise word length limit\n";
   public char[]  delimiters ;

    public ArrayList<String> read_File(String source ) throws FileNotFoundException { 
    	ArrayList<String> text = new ArrayList<String>();
	       File obj = new File(source) ;
 	       Scanner reader = new Scanner(obj); 
 	       reader.toString(); 
 	       while(reader.hasNext()) {
 	    	  text.add(reader.next());
 	    	   
 	       }
 	       return text;	
    }
    public float word_phrase_delimiter(ArrayList<String>  text, int min_size) { 
    	int n = 0;
    	int phrase_size=0;
    	for(int i=0; i<text.size(); i ++) { 
    		for(int j=0; j<text.get(i).length(); j++) { 
    	        char letter=text.get(i).charAt(j); 
    	        if(compare(letter )) { 
    	        	text.get(i).substring(j);
    	        	phrase_size++;    	        	 
    	        }
    		}
    		if(text.get(i).length()>= min_size) {
    			n++;
    		}
    	}
       return (float) n/phrase_size;    	
    }
    //to compare each char with the delimiters 
    public boolean compare(char letter   ) {
    	for(int i= 0 ; i<delimiters.length; i++) { 
    		if(delimiters[i]==letter) {    			
    			return true;
    		}
       	} 	
		return false; 
      }

}
