import java.util.Scanner;

class Login{
    String userId = "a";
    String password = "p";
    public String loginUser(String user, String pass) 
    {
       
 
        if ((user.equals(userId)) )
        		//&& (pass==password))
        {
        	
                System.out.println("Welcome User!");
                return ("Welcome");

        	
        }
       else 
         {
        	System.out.println("Access Denied!");
        	return ("Denied");
           }
    }

}
  
public class Assignment1Q6 {

	public static void main(String[] args)
	{
		 String user;
	        Scanner  input = new Scanner(System.in);
	         
	        System.out.println("Enter Your userid:");
	        user = input.nextLine();
	        String pass;
	         
	        System.out.println("Enter Your Password:");
	        pass = input.nextLine();
	
	        Login obj=new Login();
	        String out=obj.loginUser(user, pass);
	        System.out.println(out);
	        
            //Scanner.close(); 

	}
}
