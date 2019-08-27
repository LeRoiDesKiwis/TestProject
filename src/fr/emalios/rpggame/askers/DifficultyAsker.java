package fr.emalios.rpggame.askers;

import fr.emalios.rpggame.enums.Difficulty;
import fr.emalios.rpggame.util.Reference;

import java.util.Optional;
import java.util.Scanner;

public class DifficultyAsker extends Asker<Difficulty> {
    public DifficultyAsker(Scanner scanner) {
        super(scanner);
    }

    @Override
    public Difficulty ask(String ask) {
        System.out.println(Reference.CHOOSE_GAME_TYPE);
        String str = scanner.nextLine();
        Optional<Difficulty> difficulty = Difficulty.fromString(str);
        return difficulty.orElseGet(() -> ask(ask));

    }
}
