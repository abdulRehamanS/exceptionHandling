package In.abdul.Exception.Handling.ExceptionHandling;

public class AppException extends RuntimeException {


    // 0- parameter constructor
    public AppException() {
    }

    // parameters constructor with input parameters
    public AppException(String message) {
        super(message);
    }
}
