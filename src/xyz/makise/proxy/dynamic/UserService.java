package xyz.makise.proxy.dynamic;

public class UserService implements IUserService {
    @Override
    public void addUser() {
        System.out.println("add user");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete user");
    }

    @Override
    public void findUser() {
        System.out.println("find user");
    }
}
