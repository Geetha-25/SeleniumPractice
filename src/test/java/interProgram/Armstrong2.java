package interProgram;

public class Armstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int i=1,a,c,n;

while(i<500)
{
		n=i;
		c=0;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
			if(c==i)
			{
				System.out.println(i+"armstrong");
			}
			/*else
			{
				System.out.println("not armstrong");
			}*/
			i++;
		}
		
}
}

