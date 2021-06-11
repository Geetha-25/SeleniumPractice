package interProgram;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.Test;

public class SortString {

	@Test()
	public void sort()
	{
		String a[]= {"abi","zai","anu","anu"};
		
		// sorted to sort an array
		// distinct() to remove duplicate
		// collector to collect in list
		// for each to print
	List<String> b=	Arrays.asList(a);
	List<String> k=b.stream().distinct().sorted().collect(Collectors.toList());
	
System.out.println(	k.get(0));


for( String h : k)
{
	System.out.println(h);
}
		//	forEach(s-> System.out.println(s));
	}
	
	
	
	
}
