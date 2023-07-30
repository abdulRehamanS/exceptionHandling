package In.abdul.Exception.Handling.Controller;


import In.abdul.Exception.Handling.ExceptionHandling.AppException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping(value = "/")
    public String getMsg() {
        System.out.println("Method started()");
        String msg = "Hello World!";

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            throw new AppException(e.getMessage());
        }

        System.out.println("Method finished()");
        return msg;
    }
}
