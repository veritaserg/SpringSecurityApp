package springsecurityapp.service;

import springsecurityapp.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
