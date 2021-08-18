package service;

import entity.User;
import repository.user.UserRepository;
import repository.user.UserRepositoryImpl;
import service.base.BaseServiceImpl;

import java.util.List;

public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepository> implements UserService {


    protected UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long aLong) {
        return null;
    }
}
