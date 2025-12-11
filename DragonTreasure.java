
import java.util.ArrayList;

public class DragonTreasure {



   private Dungeon dungeon;    
   private ArrayList<Room> rooms = new ArrayList();
   Player player;
    public void addRooms(Room room) {
        this.rooms.add(room);

    }

    public void setupGame() {
        this.player = new Player();
     Room startRoom = new Room("Välkommen Qwazi till din skattjakt.\\n" + //
                  "Du står utanför en grotta. Det luktar svavel från öppningen\\n" + //
                  "Grottöppningen är österut. Skriv \\\"ö\\\" och tryck på [Enter] för att komma in i grottan");
     Room andraRoom = new Room("När du går in i grottan kollapsar ingången bakom dig.\\n" + //
                  "Rummet är upplyst av några ljus som sitter på ett bord framför dig.");
     Room tredjeRoom = new Room("Du ser en död kropp på golvet.");
     Room fjärdeRoom = new Room("Du ser en brinnande fackla i rummets ena hörn och känner en motbjudande stank.\\n" + //
                  "Du ser en utgång österut");
     Room fämteRoom = new Room("Du kommer in i ett fuktigt rum med vatten sipprandes längs den västra väggen.");
     Room sjätteRoom = new Room("Oj, om du går norr kommer du till där du började!");
     Room sjundeRoom = new Room("Här inne finns en eldsprutande drake... läskigt!");
     Room winnersRoom = new Room("Du hittade ut! Grattis!");

        winnersRoom.setWinnersRoom();
      startRoom.doors.add(new Door('ö', false, andraRoom));
      andraRoom.doors.add(new Door('n', false, tredjeRoom));
      andraRoom.doors.add(new Door('s', false, sjätteRoom));
      tredjeRoom.doors.add(new Door('ö', false, fjärdeRoom));
      tredjeRoom.doors.add(new Door('s', false, andraRoom));
      fjärdeRoom.doors.add(new Door('v', false, tredjeRoom));
      fjärdeRoom.doors.add(new Door('s', false, fämteRoom));
      fjärdeRoom.doors.add(new Door('ö', false, winnersRoom));
      fämteRoom.doors.add(new Door('n', false, fjärdeRoom));
      fämteRoom.doors.add(new Door('ö', false, sjundeRoom));
      fämteRoom.doors.add(new Door('v', false, sjätteRoom));
      sjätteRoom.doors.add(new Door('ö', false, fämteRoom));
      sjätteRoom.doors.add(new Door('n', false, andraRoom));
      sjundeRoom.doors.add(new Door('v', false, fämteRoom));
      
      this.rooms.add(startRoom);
      this.rooms.add(andraRoom);
      this.rooms.add(tredjeRoom);
      this.rooms.add(fjärdeRoom);
      this.rooms.add(fämteRoom);
      this.rooms.add(sjätteRoom);
      this.rooms.add(sjundeRoom);
      this.rooms.add(winnersRoom);
      this.dungeon = new Dungeon();
      this.dungeon.setCurrentRoom(startRoom);
    


    }   

    public void endGame() {

    }






}
