package fr.emalios.rpggame.askers;

import fr.emalios.rpggame.player.Player;
import fr.emalios.rpggame.util.Reference;

import java.util.Scanner;

public class PlayerAsker extends Asker<Player> {
    public PlayerAsker(Scanner scanner) {
        super(scanner);
    }

    @Override
    public Player ask(String ask) {

        System.out.println(Reference.CHOOSE_NAME);
        String playerName = scanner.nextLine();
        if(playerName.isEmpty())
        {
            return ask(ask);
        }
        System.out.println("Name : " + playerName);

        return new Player(playerName);
    }
}
