package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private ArrayList<Room> rooms;
    private ArrayList<Pool> pools;
    private ArrayList<Gym> gyms;
    private String name;

    public Hotel(String name) {
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
        pools = new ArrayList<>();
        gyms = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRoom(Room room) {
        room.setNumber(room.getNumber());
        room.setDescription(room.getDescription());
        room.setStatus(room.getStatus());

        rooms.add(room);
    }

    public void addPool(Pool pool) {
        pools.add(pool);
    }

    public void addGym(Gym gym) {
        gyms.add(gym);
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }


    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Pool> getPools() {
        return pools;
    }

    public ArrayList<Gym> getGyms() {
        return gyms;
    }
}
