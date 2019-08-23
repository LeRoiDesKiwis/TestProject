package fr.emalios.rpggame;

import fr.emalios.rpggame.game.Game;
import fr.emalios.rpggame.game.GameInitializer;
import fr.emalios.rpggame.util.Reference;

/**
 * @author Emalios
 */

public class Main {

    public static void main(String[] args)
    {
        System.out.println(Reference.WELCOME);
        GameInitializer gameInitializer = new GameInitializer();
        gameInitializer.initializeGame();
    }
}
