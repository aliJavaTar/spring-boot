package ir.maktab.userservice.service;

import ir.maktab.userservice.model.User;
import org.springframework.stereotype.Service;
//storeType
@Service
public interface UserService {
    void createUser(User user);
}
