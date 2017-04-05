package models;

public class ServerData {
    private String date;
    private String message;

    public ServerData(String date, String message) {
        this.date = date;
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }
}
