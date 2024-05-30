package java_and_basic_api;

import java.util.Objects;

public class User {

    private String userName;
    private String userSurname;

    public User(String userName, String userSurname) {
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public User(String userName) {
        this.userName = userName;
        this.userSurname = null;
    }

    public void changeUserName(String userName) {
        this.userName = userName;
    }

    public void changeUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    @Override
    public String toString(){
        if (userSurname != null) {
            return userName + ' ' + userSurname;
        } else return userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(userSurname, user.userSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userSurname);
    }
}
