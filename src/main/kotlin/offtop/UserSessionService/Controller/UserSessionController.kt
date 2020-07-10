package offtop.UserSessionService.Controller;

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
public class UserSessionController{
    @RequestMapping("/Test")
    fun test() = "I got the POWER!!"


}