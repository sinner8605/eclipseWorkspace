package ArraysPack;

public class removeDuplicatedFromArray {
	
	static int remDup(int a[],int n)
	{
		int res = 1;
		for(int i = 1;i<n;i++)
		{
			if(a[res-1]!=a[i])
			{
			a[res] = a[i];
			res++;
			}
		}
		 return res;
	}

	public static void main(String[] args) {
		int a[]= {10,20,20,30,30,30};
		int n=6;
		System.out.println("Befor removal :\t");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		n = remDup(a,n);
		System.out.println("\nAfter removal : \t");
		for(int j = 0; j<n ; j++)
		{
			System.out.print(a[j]+"  ");
		}
	}

}
