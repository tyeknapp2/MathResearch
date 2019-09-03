package errors;

public class TurnMismatchError extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TurnMismatchError(String msg) {
		super(msg);
	}
}
