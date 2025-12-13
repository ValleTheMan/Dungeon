import java.util.ArrayList;
import java.util.Iterator;
 

class Room {
    // Attribute
    String roomDesc;
    ArrayList<Door> doors = new ArrayList<>();  // ArrayList to hold Door objects
    boolean isWinnersRoom = false;

    // Method to display room narrative
    void doNarrative() {
        System.out.println(roomDesc);
        System.out.println("Doors available for further navigation:");
        Iterator<Door> var1 = doors.iterator();

        while (var1.hasNext()) {
            Door d = var1.next();
            System.out.println("Vädersträck: " + d.direction);
        }
    }
    

    // Method to set the room as the winning room
    void setWinnersRoom() {
        isWinnersRoom = true;
    }

    // Method to check if the room is the winning room
    boolean getIsWinnersRoom() {
        return isWinnersRoom;
    }

    // Constructor
    Room(String roomDesc) {
        this.roomDesc = roomDesc;
    }
}