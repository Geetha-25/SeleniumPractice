package interProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class sortint {
	@Test()
	public void sort()
	{
		Integer[] arr2 = {54, 432, 53, 21, 43};
		Integer[] arr3 = new Integer[2];
		arr3[0]=60;
		arr3[1]=20;


		
		// sorted to sort an array
		// distinct() to remove duplicate
		// collector to collect in list
		// for each to print
	List<Integer> b=	Arrays.asList(5,6,7);
	List<Integer> k=b.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(k.get(0));
	
	
	
	List<Integer> c=	Arrays.asList(arr3);
	List<Integer> k1=c.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(k1.get(0));
	}
	
}
