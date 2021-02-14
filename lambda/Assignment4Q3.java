package lamda;

import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class Assignment4Q3 {
    static void modifyValue(){
    	Consumer<Integer> c=(x)->System.out.println("modified value is"+(x+6));
    	c.accept(10);    	
    };
    static class Product {
    	private int i;
    	Product (int y){
    		i=y;
    	}
    	public int method()
    	{
    		return i;
    	}
    }
    static void display() {
        Supplier<String> s = () ->"it is displaying"; 
       System.out.println( s.get());

    }
    public static void main(String[] args) {
    	modifyValue();
    	display();
    	Product obj = new Product(5);
    	Predicate<Product> p=i -> (i.method()<10);
    	System.out.println(p.test(obj));
    	Function<Integer, Double> f = b -> b+3.0;
		System.out.println(f.apply(10));
    	
    	
}}