package ArraysPack;

public class maxSumCircularArray {
	static int normalMax(int a[],int n)
	{
		int res= a[0],maxEnding = a[0];
		for(int i=1;i<n;i++)
		{
			maxEnding = Math.max(maxEnding+a[i], a[i]);
			res = Math.max(maxEnding, res);
		}
		return res;
	}
	static int overAllMaxSum(int a[],int n)
	{
		int normalSum = normalMax(a,n);
		
		//for negative array
		if(normalSum<0)
			return normalSum;
		
		int arraySum = 0,circularSum=0;
		for(int i=0;i<n;i++)
		{
			arraySum+=a[i];
			a[i] = -a[i];
		}
		
		circularSum = arraySum + normalMax(a,n);
		return Math.max(normalSum, circularSum);
	}
	public static void main(String[] args) {
		int a[] = {8,-4,3,-5,4};
		int n = 5;
		System.out.println(overAllMaxSum(a,n));

	}

}
