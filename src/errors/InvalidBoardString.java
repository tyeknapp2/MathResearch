/**
 * 
 */
package errors;

/**
 * @author TyeKnappenberger
 *
 */
public class InvalidBoardString extends Exception {

	/**
	 * To be thrown when the board string would be invalid.
	 * 
	 * @param msg
	 */
	public InvalidBoardString(String msg) {
		super(msg);
	}
}
