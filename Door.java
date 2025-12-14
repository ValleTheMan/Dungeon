public class Door {
   
   // Attributes
    private char direction;
    private boolean locked;
    private Room nextRoom;

   // Method to check if the door is locked
   public boolean isLocked() {
      return this.locked;
   }

   public char getDirection() {
       return this.direction;
   }

   public Room getNextRoom() {
       return this.nextRoom;
   }

   public void setDirection(char direction) {
       this.direction = direction;
   }

   public void setLocked(boolean locked) {
       this.locked = locked;
   }

   public void setNextRoom(Room nextRoom) {
       this.nextRoom = nextRoom;
   }

   // Constructor
   public Door(char direction, boolean locked, Room nextRoom) {
       this.direction = direction;
       this.locked = locked;
       this.nextRoom = nextRoom;
   }

}