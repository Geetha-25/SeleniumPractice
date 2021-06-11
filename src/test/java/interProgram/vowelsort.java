package interProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

@Test
public class vowelsort {
	public void sort()
	{
		String a[]= {"abi","zai","enu","unu"," vinu","udhai"};
		List<String> b=	Arrays.asList(a);
		b.stream().filter(l->l.startsWith("a" ) 
				|| l.startsWith("e")).forEach(l-> System.out.println(l));
		
		b.stream().filter(s->s.startsWith("u" )).map(s-> s.toUpperCase()).
		forEach(s-> System.out.println(s));
		
		
		List<String> g=b.stream().filter(s->s.startsWith("u" )).collect(Collectors.toList());
		g.forEach(m ->System.out.println(m));
		System.out.println(g.get(1));
	}
	
}
