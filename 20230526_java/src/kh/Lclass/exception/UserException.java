package kh.Lclass.exception;

public class UserException extends Throwable/* Exception */{
	public UserException() {
		super("This is 유ser익xception message.");
	}
	public UserException(String msg) {
		super(msg);
	}
}
