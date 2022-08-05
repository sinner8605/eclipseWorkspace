package ArraysPack;

public class ArrayInsert {
	static int insert(int arr[], int elementExist, int varAdd, int capacity, int position)
    {
    	if(elementExist == capacity)
    		return elementExist;

    	int idx = position - 1;

    	for(int i = elementExist - 1; i >= idx; i--)
    	{
    		arr[i + 1] = arr[i];
    	}

    	arr[idx] = varAdd;

    	return elementExist + 1;
    } 
	
	public static void main(String[] args) {
		 int arr[] = new int[5], capacity = 5, elementExist = 3;

	       arr[0] = 5; arr[1] = 10; arr[2] = 20;

	       System.out.println("Before Insertion");

	       for(int i=0; i < elementExist; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       System.out.println();

	       int varAdd = 7, position = 2;

	       elementExist = insert(arr, elementExist, varAdd, capacity, position);

	       System.out.println("After Insertion");

	       for(int i=0; i < elementExist; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }
		

	}

}
