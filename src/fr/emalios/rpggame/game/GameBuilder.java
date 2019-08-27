package fr.emalios.rpggame.game;

import fr.emalios.rpggame.enums.Difficulty;
import fr.emalios.rpggame.player.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Emalios
 */

public class GameBuilder
{

    private List<String> stringGameTypes = new ArrayList<>();
    private Player player;
    private Difficulty difficulty;
    private Game game;

    public GameBuilder withPlayer(Player player){
        this.player = player;
        return this;
    }

    public GameBuilder withGameType(Difficulty type){
        this.difficulty = type;
        return this;
    }

    public Game build(){
        return new Game(player, difficulty);
    }

}
