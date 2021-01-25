
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate)
    {
        double p,r,simpleInterest1=0;
        p=principalAmount;
        r=interestRate;
        int n=time;
       
    	 simpleInterest1 = (p*r*n)/100;
    	 return simpleInterest1;
      
      }
    public double compoundInterest(double principalAmount,int time,double interestRate)
    {
        double p,r;
        p=principalAmount;
        r=interestRate;
        int t=time;
    	int n=12;
        double result = p * Math.pow(1 + (r / n), n * t);

        return result;

    }
}
public class Assignment1Q3 {
    public static void main (String args[])
    {
    	SiCi si=new SiCi();
    	SiCi ci=new SiCi();
    	double simple=si.simpleInterest(100000, 2, 2);
    	double compound=ci.compoundInterest(2000, 5, .08);
    	System.out.println(simple);
    	System.out.println(compound);

    }
}

