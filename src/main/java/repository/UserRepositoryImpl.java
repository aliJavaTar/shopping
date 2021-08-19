package repository.user;
import entity.User;
import hibernateutil.HibernateUtil;
import repository.base.BaseRepositoryImpl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class UserRepositoryImpl extends BaseRepositoryImpl<User,Long> implements UserRepository{

    protected UserRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public User findByUserName(User user) {
        return (User) entityManager.createQuery("from User where username=:username and password=:password")
                .setParameter(user.getUsername(),user.getPassword()).getSingleResult();
    }
}
