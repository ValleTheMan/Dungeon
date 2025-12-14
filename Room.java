import java.util.ArrayList;
import java.util.Iterator;
 

class Room {
    // Attribute
    private String roomDesc;
    private ArrayList<Door> doors = new ArrayList<>();  // ArrayList to hold Door objects
    private boolean isWinnersRoom = false;

    // Getter and Setter for doors
    public void addDoor(Door door) {
        this.doors.add(door);
    }

    public Iterator<Door> getDoorsIterator() {
        return this.doors.iterator();
    }

    // Getter and Setter for roomDesc
    public String getRoomDesc() {
        return this.roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }


    // Method to display room narrative
    void doNarrative() {
        System.out.println(roomDesc);
        System.out.println("Doors available for further navigation:");
        Iterator<Door> var1 = doors.iterator();

        while (var1.hasNext()) {
            Door d = var1.next();
            System.out.println("Vädersträck: " + d.getDirection());
        }
    }




    // Method to check if the room is the winning room
    boolean getIsWinnersRoom() {
        return isWinnersRoom;
    }

        // Method to set the room as the winning room
    public void setWinnersRoom() {
        isWinnersRoom = true;
    }

    // Constructor
    Room(String roomDesc) {
        this.roomDesc = roomDesc;
    }
}