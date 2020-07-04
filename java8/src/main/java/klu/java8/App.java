package klu.java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
//import java.util.function.Predicate;
//import java.util.stream.Collector;
import java.util.stream.Collectors;
/**
 * Hello world!
 *
 */
public class App 
{
	
	public List<String> search(List<String> list) {  
        //System.out.println( "Hello World!" );
		return list.stream().filter((String s)->s.startsWith("a")).filter((String s)->s.length()==3).collect(Collectors.toList());
    }
	public Double average(List<Integer> list) {  
        //System.out.println( "Hello World!" );
		return list.stream().mapToInt(val->val).average().orElse(0.0);
		/*if we don't write orelse then we need to declare optionaldouble*/
    }
	public List<String> returnPalindromes(List<String> arr)
	{
		
		return arr.stream().filter((String s)->s.equals(new StringBuffer(s).reverse().toString())).collect(Collectors.toList());
		
	}
	
}
