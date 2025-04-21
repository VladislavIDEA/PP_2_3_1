package web.repository;

import web.model.User;

import java.util.List;

public interface UserRepo {
    List<User> findAll();
    User findById(Long id);
    User save(User user);
    void deleteById(Long id);
}
