package sample.restful;

import com.matrix001.falcoframework.boot.FalcoApplication;
import com.matrix001.falcoframework.web.bind.annotation.RequestMapping;
import com.matrix001.falcoframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

@RestController
public class RestFulApplication {
    private Logger logger = LoggerFactory.getLogger(RestFulApplication.class);

    @RequestMapping("/index")
    public String index(){
        logger.debug("Hello World!!!!!");

        return "hello world!";
    }

    public static void main(String... args) throws NoSuchAlgorithmException {
        String uuid = UUID.randomUUID().toString();
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] digest = md5.digest(uuid.getBytes());

        //Long i = Long.parseLong(digest, 16);
        FalcoApplication.run(RestFulApplication.class, args);

    }
}
