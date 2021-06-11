package interProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class map1 {
	public WebDriver driver;

	@Test
	public void merge() {

		List<String> h = new ArrayList<String>();
		h.add("deepak");
		h.add("anu");
		h.add("Ashwin");
		System.out.println(h.get(1));
		List<Integer> h2 = new ArrayList<Integer>();
		h2.add(96);
		h2.add(45);
		h2.add(55);
		System.out.println(h.get(2));
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < h.size(); i++) {
			map.put(h.get(i), h2.get(i)); // is there a clearer way?
		}

		System.out.println(map);
		System.out.println(map.get("anu"));
		
		
		
		

	}
}
