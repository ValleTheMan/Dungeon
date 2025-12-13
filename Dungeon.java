import java.util.Iterator;
import java.util.Scanner;

class Dungeon {

    Room currentRoom;
    boolean gameComplete = false;

    Dungeon(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

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

    void playGame() {
        Scanner sc = new Scanner(System.in);

        while (!gameComplete) {
            currentRoom.doNarrative();
            String input = sc.nextLine();

            if (input.length() == 1) {
                inputHandling(input.charAt(0));
            } else {
                System.out.println("Ogiltigt kommando.");
            }

            if (currentRoom.getIsWinnersRoom()) {
                gameComplete = true;
            }
        }

        System.out.println("🎉 SPELET ÄR KLART! 🎉");
    }
}
