package addressBookCollection;

import java.util.ArrayList;

public class AddressBook5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		ArrayList<String> pappu=new ArrayList<String>();  
		
		pappu.add("Aryan");
		pappu.add("Aahan");
		pappu.add("Shakshi");
		pappu.add("Ganesh");
		pappu.add("Vinod");
	  
	      System.out.println(pappu);
	  
	      //Adding trough index value
	      pappu.add(3, "Aryan");
	  
	      //displaying elements
	      System.out.println(pappu);
	   }  
	}


