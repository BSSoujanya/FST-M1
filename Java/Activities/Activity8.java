package Activities;

class CustomException extends Exception {
	private String message = null;
	
	public CustomException (String message) {
		this.message = message;
		
	}

	@Override
	public String getMessage() {
		return message;
	}
}
public class Activity8 {

	public static void main (String[] args) {
		try {
			Activity8.testException("Will Print to Console");
			Activity8.testException(null);
			Activity8.testException("Won't Execute");
		}
		catch(CustomException Mes) {
			System.out.println("Inside catch block: "+Mes.getMessage());
		}
	}
	static void testException (String str) throws CustomException {
		if (str ==null) {
			throw new CustomException ("String value is null");
				}
		else {
			System.out.println(str);
		}
			}
	
	}
	
