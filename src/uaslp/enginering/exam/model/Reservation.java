package uaslp.enginering.exam.model;

public class Reservation {
    private int roomNumber;
    private int nights;
    private Guest guest;
    private String arrivalDate;

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNights() {
        return nights;
    }

    public Guest getGuest() {
        return guest;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }
}
