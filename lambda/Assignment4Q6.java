package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
public class Assignment4Q6 {
    public static void main(String[] args) {
    	List<String> l = new ArrayList<>();
    	l.add("lowercase");
    	l.add("uppercase");
    	Assignment4Q6 obj = new Assignment4Q6();
    	System.out.println(obj.convertToUpperCase(l));
    }
    
   
    
    
    
    public List<String> convertToUpperCase(List<String> list) {
    	UnaryOperator<String> s=i->i.toUpperCase();
    	  list.replaceAll(s);
		return list;
    	  
    }  
}

