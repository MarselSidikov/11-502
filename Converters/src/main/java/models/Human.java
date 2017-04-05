package models;

public class Human {
    private String login;
    private String password;
    private String name;
    private int id;

    private Human child;

    public Human(String login, String password, String name, int id, Human child) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.id = id;
        this.child = child;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Human getChild() {
        return child;
    }
}
