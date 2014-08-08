
package ws.rs.demo.service.rest.impl;

import ws.rs.demo.model.User;
import ws.rs.demo.service.rest.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User fetchUser(String userId) {
        User u = new User();
        u.setId(100);
        u.setName("Leon.Liu");
        return u;
    }

    @Override
    public User addUser(User user) {
        return user;
    }

    @Override
    public User updateUser(User user) {
        return user;
    }

}
