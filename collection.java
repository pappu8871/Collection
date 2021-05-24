package addressBookCollection;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class AddressBookUC6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> pappu = new ArrayList <String>();  
	    
//		  pappu.add("Aryan");
//	      pappu.add("Aahan");
//	      pappu.add("Ganesh");
//	      pappu.add("Shakshi");
//	      pappu.add("Rahul");
//	      pappu.add("Raj");
	  
	      //displaying elements
	      //System.out.println(pappu);
	  
	      //Adding name trough index
	      pappu.add(0, "Aryan");
	      pappu.add(1, "Aahan");
	      pappu.add(2, "Ganesh");
	      pappu.add(3, "Shakshi");
	      pappu.add(4, "Rahul");
	      pappu.add(5, "Raj");
	  
	      //displaying elements
	      System.out.println(pappu);
	      
	      pappu.add(4, "pappu");
	      System.out.println(pappu);

	   } 
	}


