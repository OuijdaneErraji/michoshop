package grptlkhra.com.michoshop.dao;

import grptlkhra.com.michoshop.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
    public User findByUsername(String username);
}
