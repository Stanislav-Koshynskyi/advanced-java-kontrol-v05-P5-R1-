package entity;

import lombok.Getter;

@Getter
public class Email {
    private String email;
    public void setEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("email is null");
        }
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,255}$")){
            throw new IllegalArgumentException(email + " is not a valid email address");
        }
        this.email = email;
    }
    private Email(String email) {
        setEmail(email);
    }
}
