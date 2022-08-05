package ArraysPack;

public class maxDiff {
	
	//Maximum value of a[j] - a[i] such that j>i
	//Maximum value of a[j] - a[i] such that j>i
	
	static int maxDifference(int a[],int n) {
		int res=a[1]-a[0],minVal=a[0];
		for(int j=1;j<n;j++)
		{
			res=Math.max(res, a[j]-minVal);
			minVal = Math.min(minVal, a[j]);
		}
		return res;
		
	}
	public static void main(String[] args) {
		int a[] = {2,3,10,1,6,8,1};
		//read upper comment carefully
		System.out.println(maxDifference(a,a.length));

	}

}
//time = theta n
//space = theta 1