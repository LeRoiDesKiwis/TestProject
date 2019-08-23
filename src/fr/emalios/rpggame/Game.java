package fr.emalios.rpggame;

import fr.emalios.rpggame.enums.GameType;
import fr.emalios.rpggame.player.Player;
import fr.emalios.rpggame.util.Reference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Emalios
 */

public class Game
{

    private List<String> stringGameTypes;

    private Player player;
    private GameType difficulty;

    public Game()
    {
        stringGameTypes = new ArrayList<>();

        for(GameType gameType : GameType.values())
        {
            stringGameTypes.add(gameType.toString());
        }

        initializeGame();
    }

    private void initializeGame()
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
        player = new Player(playerName);
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
        this.difficulty = GameType.valueOf(difficulty.toUpperCase());
        System.out.println(difficulty);
    }
}
