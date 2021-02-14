package lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q5 {
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
    	Assignment4Q5 obj = new Assignment4Q5();
    List<String> l= obj.list;
      Consumer<String> con = i->System.out.println(i);
      con.accept(processWords(l));
    }

    public static String processWords(List<String> list) {
    	StringBuffer sb = new StringBuffer();
    	list.forEach(n->sb.append(n.charAt(0)));
    	return sb.toString();
    }
}

