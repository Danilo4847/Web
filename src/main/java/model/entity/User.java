package model.entity;

import javax.servlet.http.HttpSession;

public class User {
    private String user;
    private HttpSession secao;

    public User(String user, HttpSession secao) {
        this.user = user;
        this.secao= secao;
    }

    public String getUsername() {
        return user;
    }

    public void setUsername(String user) {
        this.user = user;
    }

    public HttpSession getSession() {
        return secao;
    }

    public void setSession(HttpSession secao) {
        this.secao = secao;
    }
}
