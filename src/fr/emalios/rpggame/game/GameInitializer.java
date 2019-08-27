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
    private Player player;
    private GameType difficulty;


    public GameInitializer()
    {

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

        new Game(player, difficulty);
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
        player = new Player(playerName);
    }

    private void getGameType(Scanner sc)
    {
        System.out.println(Reference.CHOOSE_GAME_TYPE);
        String str = sc.nextLine();
        if(!stringGameTypes.contains(str))
        {
            getGameType(sc);
            return;
        }
        difficulty = GameType.valueOf(str.toUpperCase());
        System.out.println("Game difficulty set to : " + difficulty);
        System.out.println(difficulty);
    }

}
