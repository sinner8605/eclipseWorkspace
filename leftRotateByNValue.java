package ArraysPack;

public class leftRotateByNValue {
	static void leftRotate(int a[],int n,int d)
	{
		int temp[] = new int[d];
		for(int i=0;i<d;i++)
		{
			temp[i] = a[i];
		}
		for(int i=d;i<n;i++)
		{
			a[i-d]=a[i];
		}
		for(int i=0;i<d;i++)
		{
			a[n-d+i] = temp[i];
		}
	}

	public static void main(String[] args) {
		int a[]= {0,1,2,3,4};
		int d=2;
		
		System.out.println("Befor rotating :\t");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		leftRotate(a,a.length,d);
		System.out.println("\nAfter rotating : \t");
		for(int j = 0; j<a.length ; j++)
		{
			System.out.print(a[j]+"  ");
		}

	}

}
