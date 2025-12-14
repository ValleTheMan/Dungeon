import java.util.Iterator;
import java.util.Scanner;

class Dungeon {
    private Room currentRoom;
    private boolean gameComplete = false;

    // Getter and Setter for currentRoom
    public void getCurrentRoom(Room room) {
        this.currentRoom = room;
    }

    public void setCurrentRoom(Room room) {
        this.currentRoom = room;
    }
    
    // Getter and Setter for gameComplete
    public boolean getGameComplete() {
        return this.gameComplete;
    }

    public void setGameComplete(boolean gameComplete) {
        this.gameComplete = gameComplete;
    }

    // Welcome message method
    public static void welcomeMessage(){
        System.out.println("Välkommen till Dragon Treasure!");
    }

    // Dungeon constructor
    Dungeon(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    // Input handling method
    private void inputHandling(char input) {
        Iterator<Door> it = currentRoom.getDoorsIterator();

        while (it.hasNext()) {
            Door d = it.next();
            if (d.getDirection() == input && !d.isLocked()) {
                currentRoom = d.getNextRoom();
                return;
            }
        }
        System.out.println("Ingen dörr åt det hållet.");
    }

    // Play game method
    void playGame() {
        Scanner sc = new Scanner(System.in);

        while (!gameComplete) {
            currentRoom.doNarrative();
            String input = sc.nextLine();

            if (input.length() == 1) {
                inputHandling(input.charAt(0));
            } else {
                System.out.println("Ogiltigt kommando.");   // Invalid command
            }

            if (currentRoom.getIsWinnersRoom()) {   // Check for winning room
                gameComplete = true;
            }
        }
    //  Winner message 
    System.out.println("""
                                                   _.--.
                                               _.-'_:-'||
                                           _.-'_.-::::'||
                                      _.-:'_.-::::::'  ||
                                    .'`-.-:::::::'     ||
                                   /.'`;|:::::::'      ||_
                                  ||   ||::::::'     _.;._'-._
                                  ||   ||:::::'  _.-!oo @.!-._'-.
                                  \\'.  ||:::::.-!()oo @!()@.-'_.|
                                   '.'-;|:.-'.&$@.& ()$%-'o.'\\\\U||
                                     `>'-.!@%()@'@_%-'_.-o _.|'||
                                      ||-._'-.@.-'_.-' _.-o  |'||
                                      ||=[ '-._.-\\\\U/.-'    o |'||
                                      || '-.]=|| |'|      o  |'||
                                      ||      || |'|        _| ';
                                      ||      || |'|    _.-'_.-'
                                      |'-._   || |'|_.-'_.-'
                                       '-._'-.|| |' `_.-'
                                           '-.||_/.-'
                       """);
    }
}