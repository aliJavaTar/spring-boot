package ir.maktab.userservice.controller;

import ir.maktab.userservice.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    //best practice send dto
    @GetMapping("/sign-up")
    public String displaySignUpForm(User user){
        return "add-user";
    }
}
