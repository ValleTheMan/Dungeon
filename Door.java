public class Door {
   
   
   
    public char direction;
    public boolean locked;
    public Room nextRoom;


   public boolean isLocked() {
      return this.locked;
   }

   public Door(char direction, boolean locked, Room nextRoom) {
       this.direction = direction;
       this.locked = locked;
       this.nextRoom = nextRoom;
   }





}
