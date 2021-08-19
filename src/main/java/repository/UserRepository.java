package repository.user;

import entity.User;
import repository.base.BaseRepository;

public interface UserRepository extends BaseRepository<User,Long> {
    User findByUserName(User username);
}
