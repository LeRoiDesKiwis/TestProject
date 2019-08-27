package fr.emalios.rpggame.player;

import fr.emalios.rpggame.interfaces.Displayable;

/**
 * @author Emalios
 */

public class Pseudo implements Displayable
{

    private String pseudo;

    public Pseudo(String pseudo)
    {
        this.pseudo = pseudo;
    }

    @Override
    public void display(String before, String after)
    {
        System.out.println(before+ pseudo + after);
    }

    @Override
    public String toString() {
        return pseudo;
    }
}
