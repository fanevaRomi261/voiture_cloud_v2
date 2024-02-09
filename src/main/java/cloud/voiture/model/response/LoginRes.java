package cloud.voiture.model.response;

import cloud.voiture.model.Utilisateur;

public class LoginRes {
    private String email;
    private String token;
    private Utilisateur user;

    

    public LoginRes(String email, String token, Utilisateur user) {
        this.email = email;
        this.token = token;
        this.user = user;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
