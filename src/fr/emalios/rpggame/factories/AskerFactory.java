package fr.emalios.rpggame.factories;

import fr.emalios.rpggame.askers.Asker;
import fr.emalios.rpggame.askers.DifficultyAsker;
import fr.emalios.rpggame.askers.PlayerAsker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Je fais ça pour éviter de ré-allouer de la mémoire à chaque fois, comme ça il n'y a qu'une instance des askers.
 *
 * @author LeRoiDesKiwis
 */

public class AskerFactory {

    private static List<Asker> askers = new ArrayList<>();

    static {

        Scanner scanner = new Scanner(System.in);
        askers.add(new PlayerAsker(scanner));
        askers.add(new DifficultyAsker(scanner));

    }

    public static Asker getAsker(Class<? extends Asker> clazz){

        return askers.stream().filter(asker -> asker.getClass() == clazz).findAny().orElse(null);

    }

}
