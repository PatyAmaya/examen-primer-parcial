package uaslp.enginering.exam.model;

public class Room {
    private int number;
    private String description;
    private RoomStatus status;

    public Room(int number, String description, RoomStatus status) {
        this.number = number;
        this.description = description;
        this.status = status;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
