package interProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse2 {
	public static void main(String[] args) {
		String s="anjalian";
		String rev="";
List<String> li=Arrays.asList("anj","anjaliiiii");
li.stream().forEach(s1->System.out.println(s1.length()));
System.out.println(s.substring(2, 5));
 
for(int i=s.length()-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
}
System.out.println(rev);
	}

}
