package fr.emalios.rpggame;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.emalios.rpggame.game.GameInitializer;
import fr.emalios.rpggame.player.Pseudo;
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
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.setPrettyPrinting().create();
        System.out.println(gson.toJson(new Pseudo("")));
    }
}
