package pl.karolska.homework;

public class MainCinemaSeat {

    public static void main(String[] args) {
        CinemaSeat kinepolexSeat = new CinemaSeat(88,8, true);

        kinepolexSeat.getNumber();
        kinepolexSeat.getRowNumber();
        kinepolexSeat.getIsOccupied();


        System.out.print("Seat number " + kinepolexSeat.getNumber());
        System.out.print(" in row " + kinepolexSeat.getRowNumber());
        System.out.print(" is currently occupied: " + kinepolexSeat.getIsOccupied());


    }
}
