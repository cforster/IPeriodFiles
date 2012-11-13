import java.util.*;

class DictFile {

    public static void main(String[] args) {
	String  s = "O for a Muse of fire, that would ascend The brightest heaven of inventon, A kingdom for a stage, princes to act";

	Map<String, Integer> freq = new LinkedHashMap<String, Integer>();


	//go through word by word
	     //check if its in the map already
	          //increase the value associated with that key by one 
	     //else
	         //put it into the map as a key with 1

	//go through every key in the map
	     //print out the key and the value.
    
	String [] words = s.split(" "); 
	for(int i=0; i<words.length;i++)
	    {
		if(freq.containsKey(words[i]))
	        {
		    freq.put(words[i], freq.get(words[i])+1);
		}

		else
		{
		    freq.put (words[i], new Integer(1));
		}

	    }

	for(String key : freq.keySet()) {
	    System.out.println(key + ":" + freq.get(key));
	}
       
 

	//BONUSES:
	//open a file, and do this with that file
	//



    }
}

