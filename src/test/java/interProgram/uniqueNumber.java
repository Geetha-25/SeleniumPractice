package interProgram;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class uniqueNumber {
@Test
public void un()
{
	Integer[] i= {5,2,6,8,11,1,1};
	List<Integer> k=Arrays.asList(i);
	k.stream().distinct().sorted().forEach(l->System.out.println(l));
	
	List<Integer> ll=Arrays.asList(5,9,88,88,96);
	ll.stream().filter(o->o.equals(88)).forEach(o->System.out.println(o));
}
}
