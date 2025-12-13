import java.util.ArrayList;
import java.util.Iterator;

class Room {
    String roomDesc;
    ArrayList<Door> doors = new ArrayList<>();
    boolean isWinnersRoom = false;

    void doNarrative() {
        System.out.println(roomDesc);
        System.out.println("Doors available for further navigation:");
        Iterator<Door> var1 = doors.iterator();

        while (var1.hasNext()) {
            Door d = var1.next();
            System.out.println("Vädersträck: " + d.direction);
        }
    }

    void setWinnersRoom() {
        isWinnersRoom = true;
    }

    boolean getIsWinnersRoom() {
        return isWinnersRoom;
    }

    Room(String roomDesc) {
        this.roomDesc = roomDesc;
    }
}
