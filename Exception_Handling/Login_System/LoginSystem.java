package Login_System;

class LoginSystem {
    private String validUser = "admin";
    private String validPass = "1234";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Invalid Username or Password!");
        } else {
            System.out.println("Login Successful!");
        }
    }
}

