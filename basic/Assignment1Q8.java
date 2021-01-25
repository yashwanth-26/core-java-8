

class BubbleSort{

    public int[] bubbleSort(int arr[]) 
    {
    	int i,j,temp=0;
    	for(i=0;i<arr.length;i++)
    	{
    		for(j=1;j<(arr.length-i);j++)
    		{
    			if(arr[j-1]>arr[j])
    			{
    				   temp = arr[j-1];  
                       arr[j-1] = arr[j];  
                       arr[j] = temp;  
    			}
    		}
    	}
    	return arr;
    }
}







public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        BubbleSort obj = new BubbleSort();
        int[] result = obj.bubbleSort(arr);
        for(int k=0;k<result.length;k++)
        {
        System.out.print(result[k] + " ");

        }
    }
}

