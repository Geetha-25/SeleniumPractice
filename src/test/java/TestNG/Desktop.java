package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Desktop {
	
@Test(priority=1, groups={"smoke"})
public void desktopChrome()
{
	System.out.println("desktop- chrome");
	
}
@Test(priority=0, groups={"sanity"})
public void desktopfirefox()
{
	System.out.println("desktop-firefox");
}
}
