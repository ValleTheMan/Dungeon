import java.util.Iterator;
import java.util.Scanner;

class Dungeon {
    Room currentRoom;
    boolean gameComplete = false;

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
        Iterator<Door> it = currentRoom.doors.iterator();

        while (it.hasNext()) {
            Door d = it.next();
            if (d.direction == input && !d.locked) {
                currentRoom = d.nextRoom;
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