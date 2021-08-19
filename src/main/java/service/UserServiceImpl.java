package service.user;

import entity.User;
import repository.UserRepository;
import repository.UserRepositoryImpl;
import service.base.BaseServiceImpl;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepository> implements UserService {
    static Scanner input = new Scanner(System.in);

    protected UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    long authId;

    Long userIdAuth;

    public void register() {
        User user = new User();
        User userField = inputUserField(user);
        User insertUser = save(userField);
        User byUserName = repository.findByUserName(insertUser);
        userIdAuth = byUserName.getId();
        System.out.println(" you can creat new activity " +
                "(if you want click number...)\n 1) createNewActivity  2) exit");
        try {
            int numberClick = input.nextInt();
            switch (numberClick) {
                case 1:
                    System.out.println("create new activity ");
                    createNewActivity();
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            register();
        }
    }
    private User inputUserField(User user) {
        do {
            if (!isUsername) {
                System.out.println("enter your username: ");
                String username = input.next();
                isUsername = cheekUserName(username);
                if (isUsername) {
                    user.setUsername(username);
                } else System.out.println("username false .. try again");
            }
            if (!isPassword) {
                System.out.println("enter your password: ");
                String password = input.next();
                isPassword = cheekPassword(password);
                if (isPassword)
                    user.setPassword(password);
                else System.out.println("password false .. try again");
            }
            if (isPassword && isUsername)
                cheek = true;
        } while (!cheek);

        return user;
    }
    public void loginUser() {
        User user = new User();
        User userLogin = inputUserLogin(user);
        user = repository.findByUserName(userLogin);
        authId = user.getId();
        if (user.getId() == 0)
            System.out.println("user not exist");

        if ((userLogin.getPassword().equals(user.getPassword())) && userLogin.getUsername().equals(user.getUsername()))
        {


        } else
            System.out.println("username or password false");
    }

    private User inputUserLogin(User user) {
        System.out.println("enter you username ");
        String username = input.next();
        user.setUsername(username);
        System.out.println("enter you password ");
        String password = input.next();
        user.setPassword(password);
        return user;
    }

    private boolean cheekUserName(String text) {
        boolean isTrue;
        String regex = "^[a-zA-Z]([._-](?![._-])|[a-zA-Z0-9]){1,16}[a-zA-Z0-9]$";
        isTrue = Pattern.matches(regex, text);
        return isTrue;
    }

    private boolean cheekPassword(String text) {
        boolean isTrue;
        String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$";
        isTrue = Pattern.matches(regex, text);
        return isTrue;
    }


}
