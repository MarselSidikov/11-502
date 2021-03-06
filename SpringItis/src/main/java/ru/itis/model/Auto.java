package ru.itis.model;

public class Auto {
    private Long id;
    private String model;
    private User user;

    public Auto() {
    }

    public Auto(Long id, String model, User user) {
        this.id = id;
        this.model = model;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
