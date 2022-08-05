package ArraysPack;
import java.util.*;

public class ArraylistExample {

	public static void main(String[] args) {
		// 
		ArrayList<Integer> a1  = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element count : ");
		int n = sc.nextInt();
		for(int i = 0;i<n;i++)
		{
			a1.add(i+1);
		}
		System.out.println("Showing element way 1 : ");
		for(int k = 0;k<a1.size();k++)
		{
			System.out.println(a1.get(k));
		}
		System.out.println("Showing element way 2:");
		System.out.print(a1);
		

	}

}
