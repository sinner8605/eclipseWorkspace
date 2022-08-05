package ArraysPack;

public class frequncySortedArray {
	static void printFreq(int arr[],int n)
	{	
		int freq =1;
		for(int i=1;i<n;i++)
		{
			while(i < n && arr[i] == arr[i - 1])
    		{
    			freq++;
    			i++;
    		}
//			for(;i<n&&arr[i]==arr[i-1];i++)
//			{
//				freq++;
//			}

    		System.out.println(arr[i - 1] + " " + freq);

    		
    		freq = 1;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 10, 20, 30, 30, 30}, n = 6;

	       printFreq(arr, n);

	}

}
