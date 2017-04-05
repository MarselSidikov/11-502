package dto;

public class HumanDto {
    private String message;
    private String name;
    private String childName;

    public HumanDto(String message, String name, String childName) {
        this.message = message;
        this.name = name;
        this.childName = childName;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public String getChildName() {
        return childName;
    }
}
