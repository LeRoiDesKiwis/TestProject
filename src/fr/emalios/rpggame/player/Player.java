package fr.emalios.rpggame.player;


/**
 * @author Emalios
 */
public class Player
{

    private Pseudo pseudo;

    public Player(String pseudo)
    {
        this.pseudo = new Pseudo(pseudo);
    }

    @Override
    public String toString() {
        return pseudo.toString();
    }
}
