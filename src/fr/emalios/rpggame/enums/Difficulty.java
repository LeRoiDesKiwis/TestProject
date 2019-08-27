package fr.emalios.rpggame.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Emalios
 */

public enum Difficulty
{
    EASY,
    NORMAL,
    HARD;

    public static List<Difficulty> toList(){
        return Arrays.asList(values());
    }

    public static Optional<Difficulty> fromString(String string){
        return toList()
                .stream()
                .filter(type -> type.toString().equalsIgnoreCase(string))
                .findAny();
    }
}
