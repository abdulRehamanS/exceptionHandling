package In.abdul.Exception.Handling.ExceptionHandling;




// creating costume exception class here by extending to RunTimeException
public class AppException extends RuntimeException {


    // 0- parameter constructor
    public AppException() {
    }

    // parameters constructor with input parameters
    public AppException(String message) {
        super(message);
    }
}
