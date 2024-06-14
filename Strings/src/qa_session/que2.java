package qa_session;

public class que2 {
	static boolean checkPalindrme(String s) {
		
		System.out.println(s);
		StringBuffer s1 = new StringBuffer();
		
		for(int i=0; i<s.length(); i++) {
			s1.append(s.charAt(s.length()-1-i));
		}
		System.out.println(s1);
		//ithe String mdhe store karav lagli. bcoz StringBuffer kade
		//toLowerCase method nahi.
		String s2 = new String(s1);
		
		if(s.toLowerCase().equals(s2.toLowerCase())){
			return true;
		} else {
			return false;
		}
	}
}
