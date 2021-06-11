package interProgram;

public class Armstrong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,a,n;
				int i=153;
				n=i;
while(n>0)
{
	a=n%10;
	n=n/10;
c=c+(a*a*a);
}
if(c==i)
{
	System.out.println("Armstrong num");
}
	}

}
