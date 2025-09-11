package theory.practice1.task1.after;

import java.util.List;

class UserRepository {

    private List<User> users;

    public UserRepository(List<User> users) {
        this.users = users;
    }

    public User findUser(String username) {
        System.out.println("We are trying to find user: " + username);
        return users.stream().filter(it -> it.getUsername().equals(username)).findFirst().get();
    }
}
