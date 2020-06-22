
public class ExceptionHandling {

	public static void main(String[] args) {
		int i = 10;
		int j = 0 ;
		String str = null;
		try {
			System.out.println(i/j);//only first exception is handled by try block
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(str.toUpperCase());
		}finally {
			
		}

	}

}
