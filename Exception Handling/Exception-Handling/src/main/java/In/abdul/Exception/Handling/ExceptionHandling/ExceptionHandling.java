package In.abdul.Exception.Handling.ExceptionHandling;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice  //RestControllerAdvice
public class ExceptionHandling {


    @ExceptionHandler(value = AppException.class) // handling exception by cutsome exception class
    public ResponseEntity<ExceptionInfo> handleException(AppException app) {

        String msg = app.getMessage();

        ExceptionInfo info = new ExceptionInfo();
        info.setExceptionCode("EX200OK");
        info.setExceptionMessage("Exception occurred");

        return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
