package lamda;

import java.util.ArrayList;

public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
    	employeeList.removeIf(n->((n.length()>3)));
		return employeeList;
    	
    	
    }
    public static void main(String[] args) {
    	ArrayList<String> list = new ArrayList<>();
    	list.add("apple");
    	list.add("boll");
    	list.add("cat");
    	list.add("horses");
    	list.add("lion");
    	Assignment4Q4 obj = new Assignment4Q4();
    	
    	ArrayList<String> l=obj.removeOddLength(list);
    	for(String s : l) {
    		System.out.println(s);
    		
    	}
   
    	
    }
}

