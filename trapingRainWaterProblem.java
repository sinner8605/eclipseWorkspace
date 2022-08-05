package ArraysPack;

public class trapingRainWaterProblem {
	
	static int getWater(int a[],int n)
	{
		int res=0;
		int lMax[]=new int[n];
		int rMax[] = new int[n];
		lMax[0]=a[0];
		for(int i=1;i<n;i++)
		{
			lMax[i] = Math.max(a[i],lMax[i-1]);
		}
		rMax[n-1] = a[n-1];
		for(int i = n-2;i>=0 ;i--)
		{
			rMax[i]=Math.max(a[i], rMax[i+1]);
		}
		for(int i=1 ;i<n-1 ;i++)
		{
			res+=Math.min(lMax[i],rMax[i])-a[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int a[]= {5,0,6,2,3},n=5;
		System.out.println(getWater(a,n));
		

	}

}
