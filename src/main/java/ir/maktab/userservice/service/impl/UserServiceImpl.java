package ir.maktab.userservice.service.impl;

import ir.maktab.userservice.model.User;
import ir.maktab.userservice.repository.UserRepository;
import ir.maktab.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void createUser(User user) {
     userRepository.save(user);
    }
}
