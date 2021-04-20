package log4j1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class demo {

	private static Logger log1 = LogManager.getLogger(demo.class.getName());
	
 @Test
 public void test() {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		log1.error("error message");
		log1.info("info message");
		log1.debug("debug condition");
		log1.fatal("fatal error");
	}

}
