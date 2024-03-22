package org.Jan.jfs.oop.statickeyword;

import java.util.List;

class LoginUser {
    private String username;
    private String password;

    public LoginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class JavaArguments {
    public static void main(String[] args) {
        List<LoginUser> list = List.of(new LoginUser("yash", "yash@123"), new LoginUser("raj", "raj@123"));
        if (args.length == 0) {
            System.out.println("Please provide the username and password");
        } else {
            String username = args[0];
            String password = args[1];

            boolean isUserExist = list.stream().anyMatch(user -> user.getUsername().equals(username) && user.getPassword().equals(password));
            if (isUserExist) {
                System.out.println("Welcome " + username);
            } else {
                System.out.println("Invalid UserName Or Password ");
            }
        }
    }
}
