package pl.karolska.homework;

public class CinemaSeat {

   private final int number;
   private final int rowNumber;
   private boolean isOccupied;

    public CinemaSeat(int number, int rowNumber, boolean isOccupied){
        this.number = number;
        this.rowNumber = rowNumber;
        this.isOccupied = isOccupied;
  }

  public int getNumber (){

        return this.number;
  }

  public int getRowNumber(){

        return this.rowNumber;
  }


    public void setIsOccupied(boolean occupied) {
        isOccupied = occupied;


    }
    public boolean getIsOccupied(){
        return this.isOccupied;


        }
    }

