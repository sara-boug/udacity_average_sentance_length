import java.io.Console;
import java.io.FileNotFoundException;

public class Main {
	static	String str;
    static String  delimiter; 
    static int word_limit; 

	public static void main(String[] args) {
	   background_methods meth= new background_methods();
       Console con =System.console();
       if(con==null) { 
    	   System.out.print("No console Available");
    	   return;  
       }
        try {
          con.printf(meth.help);
      	  str= con.readLine(); 
          if(str.contains("-d")) {
     	    delimiter=str.replace("-d","") ;  
     	    meth.delimiters= delimiter.toCharArray();
     	    str=con.readLine(); 	  
     	    if(str.contains("w/-l")) {
     	    	String word_lim=str.replace("w/-l", ""); 
      	    	word_limit= Integer.parseInt(word_lim.trim());
		     	String file= con.readLine("File directory : ");  
		     	float output=meth.word_phrase_delimiter( meth.read_File(file), word_limit);
		     	con.printf(String.valueOf(output));
		     	System.exit(0);
	     	 }else { 
	       	  con.printf(meth.help);
	     	   System.exit(0);

	     	   }
           } else  {
    	  con.printf(meth.help);
     	   System.exit(0);
       }
		} catch (FileNotFoundException e   ) {
	       	  con.printf("File Doesn't exist");
	     	   System.exit(0);
 		}catch(NumberFormatException nfe) {
 			con.printf("Incorrect delimiter");
	     	   System.exit(0);
 		}


 	}
	

}
