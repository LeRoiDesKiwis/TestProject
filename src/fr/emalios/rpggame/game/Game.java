package fr.emalios.rpggame.game;

import fr.emalios.rpggame.enums.GameType;
import fr.emalios.rpggame.player.Player;

/**
 * @author Emalios
 */

public class Game
{


    private Player player;
    private GameType difficulty;

    public Game()
    {

        //Initialize Game
        GameInitializer gameStarter = new GameInitializer(this);
        gameStarter.initializeGame();
        
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }

    public void setDifficulty(GameType difficulty)
    {
        this.difficulty = difficulty;
    }
}
