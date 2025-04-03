package lk.ijse.dep13.springbackend.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthHttpController {

    @PostMapping("/login")
    public String logIn(){
        return "Log in";
    }

    @DeleteMapping("/logout")
    public String logOut(){
        return "Log out";
    }
}
