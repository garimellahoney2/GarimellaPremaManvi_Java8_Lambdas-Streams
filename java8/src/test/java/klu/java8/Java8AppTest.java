package klu.java8;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;
import org.junit.Test;

public class Java8AppTest {
App a ;
@Before
public void create()
{
	a = new App();
}
	@Test
	public void testSearch() {
		ArrayList<String> test = new ArrayList<String>(); 
		test.add("abc");
		test.add("dfg");
		test.add("hhhhhh");
		test.add("");
		ArrayList<String> expected = new ArrayList<String>(); 
		expected.add("abc");
		assertEquals(expected, a.search(test));
	}
   @Test
   public void testAverage()
   {
	  Double expected = 25.0;
       // getting the list view of Array 
      List<Integer> test = Arrays.asList(new Integer[] { 10, 20, 30, 40 }); 
      assertEquals(expected,a.average(test));
   }
   @Test
   public void testReturnPalindromes()
   {
	   ArrayList<String> test = new ArrayList<String>(); 
		test.add("aba");
		test.add("dfg");
		test.add("hhhhhh");
		ArrayList<String> expected = new ArrayList<String>(); 
		expected.add("aba");
		expected.add("hhhhhh");
		assertEquals(expected, a.returnPalindromes(test));
   }
}
