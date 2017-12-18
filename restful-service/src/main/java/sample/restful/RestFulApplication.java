package sample.restful;

import com.matrix001.falcoframework.boot.FalcoApplication;
import com.matrix001.falcoframework.web.bind.annotation.RestController;

@RestController
public class RestFulApplication {
    public static void main(String... args){
        FalcoApplication.run(RestFulApplication.class, args);
    }
}
