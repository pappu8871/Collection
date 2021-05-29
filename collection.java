package addressBookCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AddressBookUC7 {

	public static void main(String[] args) {
      
		doSetPappu();
		}
	
     private static void doSetPappu() {
		// TODO Auto-generated method stub
		System.out.println(" Not allow duplicate");
		//creating LinkedHashSet
		//Duplicate obj is not allow
		Set<String> set = new LinkedHashSet<>();
		//Adding obj to the list
		set.add("Aryan");
		set.add("Aahan");
		set.add("Shakshi");
		set.add("Aryan");
       
		for(String str1 : set) {
		System.out.println(str1);
	}

	}

	
	
}



