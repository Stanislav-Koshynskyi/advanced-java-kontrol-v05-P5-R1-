package exception;

public class AmountException extends AppException {
    public AmountException(String message) {
        super(message);
    }
    public AmountException(String message, Throwable cause) {super(message, cause);}
}
