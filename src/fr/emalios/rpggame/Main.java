package fr.emalios.rpggame;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.emalios.rpggame.askers.DifficultyAsker;
import fr.emalios.rpggame.askers.PlayerAsker;
import fr.emalios.rpggame.enums.Difficulty;
import fr.emalios.rpggame.factories.AskerFactory;
import fr.emalios.rpggame.game.Game;
import fr.emalios.rpggame.game.GameBuilder;
import fr.emalios.rpggame.player.Player;
import fr.emalios.rpggame.util.Reference;

/**
 * @author Emalios
 */

public class Main {

    public static void main(String[] args)
    {
        System.out.println(Reference.WELCOME);

        Difficulty difficulty = (Difficulty)AskerFactory.getAsker(DifficultyAsker.class).ask(Reference.CHOOSE_GAME_TYPE);
        Player player = (Player)AskerFactory.getAsker(PlayerAsker.class).ask(Reference.CHOOSE_NAME);

        Game game = new GameBuilder()
                .withGameType(difficulty)
                .withPlayer(player)
                .build();

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.setPrettyPrinting().create();

        System.out.println(gson.toJson(game.toString()));
    }
}
