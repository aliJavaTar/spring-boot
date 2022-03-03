package ir.maktab.userservice.controller;

import ir.maktab.userservice.model.User;
import ir.maktab.userservice.service.UserService;
import ir.maktab.userservice.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private UserService userService ;
    //best practice send dto
    @GetMapping("/sign-up")
    public String displaySignUpForm(User user) {
        return "add-user";
    }

    @PostMapping("/add-user")
    public String addUser(@Valid User user, BindingResult result, Module module) {
        if (result.hasErrors()) {
            return "add-user";
        }
        userService.createUser(user);
        return null;
    }
}
