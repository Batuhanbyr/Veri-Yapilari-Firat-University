package ArrayLists;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// DYNAMİC ARRRAY
		
		/* ADVANTAGES
		 * 1- RANDOM ACCESS OF ELEMENTS O(1)
		 * 2- GOOD LOCALİTY OF REFERANCE AND DATA CACHE UTİLİZATİON
		 * 3- EASY TO İNSERT/DELETE AT THE END
		 * 
		 * */
		
		/* DİSADVANTAGES
		 * 1- WASTES MORE MEMORY
		 * 2- SHİFTİNG ELEMENT İS TİME CONSUMİNG O(N)
		 * 3- EXPANDİNG/SHRİNKİNG THE ARRAY İS TİME CONSUMİNG O(N)
		 * 
		 * */
		
		//ArrayList<String> arraylist = new ArrayList<String>();
		DynamicArray dynamicArray = new DynamicArray(5);
	    
		
		System.out.println(dynamicArray.capacity);	
		
        
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		
		//System.out.println(dynamicArray.get(0));
		//dynamicArray.insert(0, "X");
		//dynamicArray.delete("A");
		//System.out.println(dynamicArray.search("C"));
		
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
	}

}
