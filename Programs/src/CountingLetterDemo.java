
public class CountingLetterDemo {

	public static void main(String[] args) {
		String str = "Welcome to java";
	      int count = 0;
	      System.out.println("String: "+str);
	      for (int i = 0; i < str.length(); i++) {
	         if (str.charAt(i) == 'j')
	            count++;
	      }
	      System.out.println("Letters: "+count);
	}

}
