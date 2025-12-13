public class Door {
   
   // Attributes
    public char direction;
    public boolean locked;
    public Room nextRoom;

   // Method to check if the door is locked
   public boolean isLocked() {
      return this.locked;
   }

   // Constructor
   public Door(char direction, boolean locked, Room nextRoom) {
       this.direction = direction;
       this.locked = locked;
       this.nextRoom = nextRoom;
   }

}