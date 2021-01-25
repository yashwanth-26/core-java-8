//import java.util.ArrayList;

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
    	int c=0,j=0;
    	
     

    	for(int i=min;i<=max;i++) 
    	{
    		boolean a=armstrongCheck(i);
    		if(a==true)
    		{
    			c++;
    		}
    	}
    	int[] arr=new int[c];
    	for(int i=min;i<=max;i++)
    	{
    		boolean a=armstrongCheck(i);
    		if(a==true)
    		{
    			arr[j]=i;j++;
    		}
    	}
		return arr;
   	       
    		
    	}

	public boolean armstrongCheck(int n) {
		int sum=0,a,arm;
		arm=n;
		 while(n>0)  
	         {  
	             a=n%10;  
	             n=n/10;  
	             sum=sum+(a*a*a);  
	         } 
	         if(arm==sum)
	         {
	        	 return true;
	         }else {
	     		return false;

	         }
	         
	}
    }







public class Assignment1Q2 {

	public static void main(String[] args) {
	       int min = 100;int max = 999;
	      	       
	       ArmstrongNumBetweenRange obj=new ArmstrongNumBetweenRange();	       
            int[] a=obj.armstrongNumbersInRange(min,max);
            for(int i =0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
	
            }


	}

}
