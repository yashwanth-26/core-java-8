class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue)
    {
    	  boolean t = false; 
          for (int element : arr) { 
              if (element == toCheckValue) { 
            	  t = true;

              }
           

          }
		return t; 
    }
}
public class Assignment1Q7 {
    public static void main(String[] args) 
    {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        SearchArray obj= new SearchArray();
        boolean value=obj.searchArray(arr, valueToCheck);
        System.out.println(value);
    }   
}
   

