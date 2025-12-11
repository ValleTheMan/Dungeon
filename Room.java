
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Room {
    private String roomDesc;
    public ArrayList<Door> doors = new ArrayList();
   
    
    public Room(String roomDesc) {
        this.roomDesc = roomDesc;
   
    }

   
    public void addDoor(Door door) {
        this.doors.add(door);
    }
   
    public void doNarrative() {

    }
    public void setWinnersRoom() {
        // Mark this room as the winners room
    }
}

   
