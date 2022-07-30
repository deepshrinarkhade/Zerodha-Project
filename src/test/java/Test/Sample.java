package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener.class)

public class Sample {
	@Test
	public void test1()
	{
		System.out.println("test1 execute");
	}
	@Test
	public void test2()
	{
		System.out.println("test2 execute");
		
	}
	@Test(timeOut=2000)
	public void Hello() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Test3 execute");
	}
	
	
}
