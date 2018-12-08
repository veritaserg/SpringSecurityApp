package springsecurityapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springsecurityapp.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}

