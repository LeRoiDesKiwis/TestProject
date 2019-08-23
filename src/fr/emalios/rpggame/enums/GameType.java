package fr.emalios.rpggame.enums;

/**
 * @author Emalios
 */

public enum GameType
{
    EASY ("easy"),
    NORMAL ("normal"),
    HARD ("hard");

    private String name;

    GameType(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
