package pl.karolska.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainCinemaRooms {
    public static void main(String[] args) {
        List<CinemaRooms> cinemaRooms = Arrays.asList(
                new CinemaRooms("ROOM 1-1", CinemaRoomsTypes.ROOM2D),
                new CinemaRooms("ROOM 1-2", CinemaRoomsTypes.ROOM2D),
                new CinemaRooms("ROOM 1-3", CinemaRoomsTypes.ROOM2D),
                new CinemaRooms("ROOM 2-1", CinemaRoomsTypes.ROOM3D),
                new CinemaRooms("ROOM 2-2", CinemaRoomsTypes.ROOM3D),
                new CinemaRooms("ROOM 2-3", CinemaRoomsTypes.ROOM3D),
                new CinemaRooms("ROOM 3-1", CinemaRoomsTypes.ROOM4D),
                new CinemaRooms("ROOM 3-2", CinemaRoomsTypes.ROOM4D),
                new CinemaRooms("ROOM 3-3", CinemaRoomsTypes.ROOM4D),
                new CinemaRooms("ROOM 3-4", CinemaRoomsTypes.ROOM4D)
        );

        Map<CinemaRoomsTypes, List<CinemaRooms>> hallsPerType = cinemaRooms.stream()
                .collect(Collectors.groupingBy(CinemaRooms::getTypeOfRoom));

        long halls_2D = hallsPerType.get(CinemaRoomsTypes.ROOM2D).size();
        System.out.println("Number of 2D cinema rooms in our cinema \"Kinepolex\": " + halls_2D);

        long halls_3D = hallsPerType.get(CinemaRoomsTypes.ROOM3D).size();
        System.out.println("Number of 3D cinema rooms in our cinema \"Kinepolex\": " + halls_3D);

        long halls_4D = hallsPerType.get(CinemaRoomsTypes.ROOM4D).size();
        System.out.println("Number of 4D cinema rooms in our cinema \"Kinepolex\": " + halls_4D);

    }

}