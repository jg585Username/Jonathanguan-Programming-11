
public class School { //class School which contains all info relating to directory
    //private fields so the variables cannot be affected by ones outside of School class
    private int roomNumber; //will contain info for class room numbers,
    private int floorNumber; //floor level,
    private String otherNotes; // and any other info pertaining to location or classroom

    School(int roomNumber, int floorNumber, String otherNotes) { //School constructor which is a method that will set up our object (directory)
        //with its desired parameters (e.g. roomNumber)
        this.roomNumber = roomNumber; //using this keyword and accessor to set variables equal to whatever is being passed through constructor parameter
        this.floorNumber = floorNumber;
        this.otherNotes = otherNotes;
    }
    //setters and getters (prebuilt method in java) which allow us to access variables in private fields
    public int getRoomNumber() { //getters retrieve/read value of variable
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) { //setters can update private variables more securely
        this.roomNumber = roomNumber;
    }
    public int getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    public String getOtherNotes() {
        return otherNotes;
    }
    public void setOtherNotes(String otherNotes) {
        this.otherNotes = otherNotes;
    }



}




