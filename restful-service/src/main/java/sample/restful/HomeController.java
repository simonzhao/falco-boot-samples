package sample.restful;

import com.matrix001.falcoframework.web.bind.annotation.RequestMapping;
import com.matrix001.falcoframework.web.bind.annotation.RestController;
import sample.restful.pojo.User;

@RestController
public class HomeController {
    @RequestMapping("/home")
    public User index(){
        User user = new User();
        user.setUserId("111111");
        user.setNickName("楠哥");
        user.setRole(1);

        return user;
    }
}
