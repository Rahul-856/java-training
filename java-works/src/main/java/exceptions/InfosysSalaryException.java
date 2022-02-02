package exceptions;

public class InfosysSalaryException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;

	public InfosysSalaryException() 
	{
		this.msg = "Sorry ||Salary too Short..";
	}

	public InfosysSalaryException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "SapientSalaryException [msg=" + msg + "]";
	}

	public String getMessage() {
		return "Message" + msg;
	}
}