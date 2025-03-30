package JDK8_Features;
import java.util.HashMap;
import java.util.Map;

public class Map_example_using_jdk8_forEach {

	public static void main(String[] args) {
		
		Map<Integer, String> hs = new HashMap<Integer, String>();
		
		hs.put(1, "Balewadi High Street");
		hs.put(2, "Baner");
		hs.put(null, "Hinjewadi");
		hs.put(null, null);
		hs.put(5, null);
		hs.put(6, "Aundh");
		
		hs.forEach((key, value) -> System.out.println(key +" : "+ value));
	}

}
