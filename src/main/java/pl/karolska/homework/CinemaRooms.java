package pl.karolska.homework;

public class CinemaRooms {
    private String roomName;
    private CinemaRoomsTypes roomType;

    public CinemaRooms(String name, CinemaRoomsTypes typeOfHall) {
        this.roomName = name;
        this.roomType = typeOfHall;
    }

    public String getRoomName() {
        return roomName;
    }

    public CinemaRoomsTypes getTypeOfRoom() {
        return roomType;
    }
}