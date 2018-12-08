package springsecurityapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springsecurityapp.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}