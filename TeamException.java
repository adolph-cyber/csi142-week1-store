public class TeamException extends Exception{
    public TeamException(String message){
        super(message);
    }

    public TeamException(String message, Throwable cause){
        super(message, cause);
    }
}
