public class Main {
    /* 
    Författare: Valentino Markouch, Oscar Dahl, Joanna Segerström
    Datum: 2025-12-13
    Version: 1.0
     */

    public static void main(String[] args) {
        Dungeon.welcomeMessage();
        DragonTreasure game = new DragonTreasure();
        game.setupGame();
        game.dungeon.playGame();
    
    }
}