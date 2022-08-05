package ArraysPack;
import java.util.*;
public class AraayListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("First");
		a1.add("Second");
		a1.add("Third");
		
		
		//add method with parameter
		a1.add(2,"Adding forth in between");
		System.out.println(a1);
		//remove method
		System.out.print("After remove : ");
		a1.remove(2);
		System.out.println(a1);
	}

}
