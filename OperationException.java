public class OperationException extends Exception {

    // Constructor that accepts a message
    public OperationException(String message) {
        super(message);
    }

    // Constructor that accepts both message and cause
    public OperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
