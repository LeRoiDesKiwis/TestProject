package fr.emalios.rpggame.enums;

import java.util.Arrays;
import java.util.List;

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

    public static boolean contains(String string){
        return toList()
                .stream()
                .anyMatch(type -> type.toString().equalsIgnoreCase(string));
    }
}
