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

    public Game(Player player, GameType difficulty)
    {
        this.player = player;
        this.difficulty = difficulty;
    }
}
