package fr.emalios.rpggame.game;

import fr.emalios.rpggame.enums.GameType;
import fr.emalios.rpggame.player.Player;
import fr.emalios.rpggame.util.Reference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Emalios
 */

public class GameInitializer
{

    private List<String> stringGameTypes;

    private Game game;

    public GameInitializer(Game game)
    {
        this.game = game;

        stringGameTypes = new ArrayList<>();

        for(GameType gameType : GameType.values())
        {
            stringGameTypes.add(gameType.toString());
        }

    }

    public void initializeGame()
    {
        //Get Player
        Scanner sc = new Scanner(System.in);
        getPlayer(sc);

        //Get difficulty
        getGameType(sc);
    }

    private void getPlayer(Scanner sc)
    {
        System.out.println(Reference.CHOOSE_NAME);
        String playerName = sc.nextLine();
        if(playerName.isEmpty())
        {
            getPlayer(sc);
            return;
        }
        System.out.println("Name : " + playerName);
        game.setPlayer(new Player(playerName));
    }

    private void getGameType(Scanner sc)
    {
        System.out.println(Reference.CHOOSE_GAME_TYPE);
        String difficulty = sc.nextLine();
        if(!stringGameTypes.contains(difficulty))
        {
            getGameType(sc);
            return;
        }
        System.out.println("Game difficulty set to : " + difficulty);
        game.setDifficulty(GameType.valueOf(difficulty.toUpperCase()));
        System.out.println(difficulty);
    }

}
