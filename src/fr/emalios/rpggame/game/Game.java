package fr.emalios.rpggame.game;

import fr.emalios.rpggame.enums.Difficulty;
import fr.emalios.rpggame.player.Player;

/**
 * @author Emalios
 */

public class Game
{
    private Player player;
    private Difficulty difficulty;

    public Game(Player player, Difficulty difficulty)
    {
        this.player = player;
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return player.toString();
    }
}
