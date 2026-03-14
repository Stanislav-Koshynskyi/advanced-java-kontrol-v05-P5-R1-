package entity;

import lombok.Getter;

import java.util.Objects;

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
    public int hashCode() {
        int hash = 7;
        return  97 * hash + Objects.hashCode(this.email);
    }
}
