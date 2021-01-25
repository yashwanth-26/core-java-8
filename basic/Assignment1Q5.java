
class TaxAmount{
    public double calculateTaxAmount(int ctc)
    {
    	double amount=0;
    	if(ctc<=180000)
    	{
    		amount = 0;
    		return (amount);
    	}
    	else if(181001<=ctc && ctc>=300000)
    	{
    		amount=ctc*0.1;

    		return (amount);
    	}else if(300001<=ctc && ctc>=500000)
    	{
    		amount=ctc*0.2;

    		return (amount);

    	}else //if(500001<=ctc && ctc>=1000000)
    	{
    		amount=ctc*0.1;

    		return (amount);

    	}
    }
}

public class Assignment1Q5 {
    public static void main(String args[]) 
    {
    	TaxAmount obj = new TaxAmount();
    			double payable=obj.calculateTaxAmount(300001);
    			System.out.println(payable);
    }
}

