package ArraysPack;

public class moveZeroAtEnd {
	
	static void moveZero(int a[],int n)
	{
	int count =0,temp;
	for(int i=0; i<n;i++)
	{
		if(a[i]!=0)
		{
			temp=a[i];
			a[i]=a[count];
			a[count]=temp;
			count++;
		}
	}
	}

	public static void main(String[] args) {
		int a[]= {10,8,0,0,12,0,9};
		
		System.out.println("Befor moving :\t");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		moveZero(a,a.length);
		System.out.println("\nAfter moving : \t");
		for(int j = 0; j<a.length ; j++)
		{
			System.out.print(a[j]+"  ");
		}


	}

}
