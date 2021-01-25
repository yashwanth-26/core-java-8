

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) 
    {
    	double sub1=subject1Marks;
    	double sub2=subject2Marks;
    	double sub3=subject3Marks;
    	if(sub1>=60 && sub2>=60 && sub3>=60) 
    	{
    		System.out.println("Passed");
    		return "Passed";
    	}
    	else if((sub1>=60 && sub2>=60) || (sub3>=60 && sub2>=60) || (sub1>=60 && sub3>=60))
    	{
    		System.out.println("Promoted");
    		return "Promoted";
    	}
    	else //((((sub1>60)||(sub2>60)||(sub3>60))&&((sub1+sub2<60)||(sub3+sub2<60)||(sub1+sub3<60)))) 
    	{ 
    		System.out.println("failed");
    		return "failed";
    	}
    	
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) 
    {
    	ResultDeclaration obj=new ResultDeclaration();
    	obj.declareResults(10, 30, 40);
    }
}

