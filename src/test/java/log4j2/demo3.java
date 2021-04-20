package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import log4j2.demo3;

public class demo3 {
	private static Logger log1 = LogManager.getLogger(demo3.class.getName());
	
	@Test
	public void test() {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		log1.error("package 2 class 2 error message");
		log1.info("package 2 class 2 info message");
	}

}
