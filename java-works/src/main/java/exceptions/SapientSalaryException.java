package exceptions;

public class SapientSalaryException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String msg;
 
public SapientSalaryException()
 {
	this.msg="Sorry ||Salary too Short..";
 }
public SapientSalaryException(String msg) {
	super();
	this.msg=msg;
}

@Override
public String toString() {
	return "SapientSalaryException [msg=" + msg + "]";
}
public String getMessage() {
	return "Message" +msg;
}
}
