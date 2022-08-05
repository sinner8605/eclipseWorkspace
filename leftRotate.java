package ArraysPack;

public class leftRotate {
	static void leftRotate(int a[],int n)
	{
		int temp=a[0];
		for(int i=1;i<n;i++)
		{
			a[i-1] = a[i];
		}
		a[n-1]=temp;
		
	}
	public static void main(String[] args) {
		int a[]= {10,8,0,0,12,0,9};
		
		System.out.println("Befor moving :\t");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		leftRotate(a,a.length);
		System.out.println("\nAfter moving : \t");
		for(int j = 0; j<a.length ; j++)
		{
			System.out.print(a[j]+"  ");
		}

	}

}
