package lamda;

import java.util.HashMap;

public class Assignment4Q7 {
    public static void main(String[] args) {
    	HashMap<String,Integer> m=new HashMap<>();
    	m.put("a", 1);
    	m.put("b", 2);
    	m.put("c", 3);
    	m.put("d", 4);
    	System.out.println(new Assignment4Q7().convertKeyValueToString(m));
    	
    	
    }
    public String convertKeyValueToString(HashMap<String, Integer> map) 
    {
    	
    	StringBuilder sb=new StringBuilder(); 
        map.entrySet().stream().forEach(e -> {sb.append(e.getKey()); sb.append(e.getValue());});
    	
    	return sb.toString();
    	    }
}