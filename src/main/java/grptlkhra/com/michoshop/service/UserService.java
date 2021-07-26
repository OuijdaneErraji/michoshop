package grptlkhra.com.michoshop.service;

import grptlkhra.com.michoshop.bean.User;
import grptlkhra.com.michoshop.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userDao.findByUsername(s);
        if(user == null)
            throw new UsernameNotFoundException("User with username "+s+" not found");
        return user;
    }
}
